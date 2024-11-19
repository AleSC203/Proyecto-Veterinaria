
package DAO;


import Clases_Cita.Motivo;
import Clases_Cita.Vacunas;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class VacunasDAO {
    //ruta del archivo
    //System.getProperty("user.dir") ruta de trabajo del proyecto
    private final String RUTA_ARCHIVO = System.getProperty("user.dir")+ "\\src\\Archivos\\Vacunas.txt";
     
    
    //leer y escribir en los archivos
    private ObjectOutputStream oEscritor;
    private ObjectInputStream oLector;
    
    //abrir los archivos de lectura y escritura
    private FileOutputStream oFileOutputStream;
    private FileInputStream oFileInputStream;
    
    //para los metodos de modificar y eliminar
    private List<Vacunas> arrayVacunas;
    
    //patron Singleton
    //Patron singleton permite tener una unica instancia de un objeto
    private static VacunasDAO instance = null;
    
    //constructor sin nada
    private VacunasDAO(){
        
    }
    
    
    public static VacunasDAO getInstance(){
        if (instance == null) {
            instance = new VacunasDAO();
        }
        return instance;
    }
    //finaliza el patron singleton
    
    
    
    
    public void abrirArchivoOutput() throws Exception{
        try {
            
            
            File oArchivo = new File(RUTA_ARCHIVO);
            if (oArchivo.exists()) {
                
                //abrir el archivo de acceso secuencial para escritura
                //sin el encabezado del objeto
                oFileOutputStream = new FileOutputStream(oArchivo,true);  //abre archivo lectura
                oEscritor = new MeObjectOutputStream(oFileOutputStream); //crea el objeto de escritura
            
            }else{
                //abrir el archivo de acceso secuencial para escritura
                //con el encabezado del objeto
                oFileOutputStream = new FileOutputStream(oArchivo,true);
                oEscritor = new ObjectOutputStream(oFileOutputStream);
            }
        
        
        } catch (IOException e) {
            throw e;
        }
    }
    
    
    
    public void abrirArchivoInput() throws Exception{
        
        try {
            
            oFileInputStream = new FileInputStream(RUTA_ARCHIVO); //abre el archivo de escritura
            oLector = new ObjectInputStream(oFileInputStream); //crea el objeto lector
        
        } catch (IOException e) {
            throw e;
        }
    }
    
    
    
    public void cerrarArchivoOutput() throws Exception{
        
        try {
            
            if(oEscritor != null){
                oEscritor.close();
                oEscritor = null;
            }
            
        } catch (IOException e) {
            throw e;
        }
    }
    
    
    
    public void cerrarArchivoInput() throws Exception{
        try {
            if (oLector != null) {
                oLector.close();
                oLector = null;
            }
        } catch (IOException e) {
            throw e;
        }
    }
    
    //Patron C.R.U.D patron para almacenar informacion 
    //C. Create R. Read U. Update D. Delete
    public void agregar(Vacunas vacuna)throws Exception{
        try {
            this.abrirArchivoOutput();
            if (oEscritor != null) {
                //escribir el objeto en el archivo
                oEscritor.writeObject(vacuna);
                //Limpiar el buffer para dejar los datos fijos en el archivo
                oEscritor.flush();
            }
        } catch (Exception e) {
            throw e;
        }
        finally{
            this.cerrarArchivoOutput();
        }
    }


    
    public Vacunas consultar(String codigo)throws Exception{
        Vacunas oRetornar = null;
        
        try {
                this.abrirArchivoInput();
                //while hasta generar error
                while (true) {
                    oRetornar = (Vacunas)oLector.readObject();
                    if (oRetornar.getNombreVacuna().equalsIgnoreCase(codigo)) {
                        return oRetornar;
                    }
                }
       
        
        } catch (Exception e) { //no se pone nada porque el while genera error
            
        }finally{
            this.cerrarArchivoInput();
             //Siempre se ejucuta el finally de esta manera siempre nos aseguraremos de cerrar correctamente los archivos
        }
        return null;
    }
    
    
    
    
    private void pasarArryTemporal_Archivo() throws Exception{
        File archivoOriginal = new File(RUTA_ARCHIVO);
        
        if (archivoOriginal.exists()) {
            archivoOriginal.delete();
        }
        
        
        if (!arrayVacunas.isEmpty()) {
            
            this.abrirArchivoOutput();
            for (Vacunas vacuna : arrayVacunas) {
                oEscritor.writeObject(vacuna);
            }
            oEscritor.flush();
        }
        
        this.cerrarArchivoOutput();
         
    }
    
    
    
    public void modificar(Vacunas vacunaP)throws Exception{
        arrayVacunas = new ArrayList<>();
        
        try {
            
                abrirArchivoInput();
                Vacunas temp = null;
                while (true) {
                    
                    temp = (Vacunas)oLector.readObject();
                    
                    if (temp.getCodigo()== vacunaP.getCodigo()) {
                       temp = vacunaP;
                    }
                     arrayVacunas.add(temp);
                }
        
        } catch (Exception e) {
        } finally {
            cerrarArchivoInput();
            pasarArryTemporal_Archivo(); //crea el archivo con la modificacion
             //Siempre se ejucuta el finally de esta manera siempre nos aseguraremos de cerrar correctamente los archivos
        }
    }
    
    
    
    public void eliminar(int codigo)throws Exception{
        arrayVacunas = new ArrayList<>();
        try {
            abrirArchivoInput();
            Vacunas temp = null;
            while (true) {
                temp = (Vacunas)oLector.readObject();
                if (temp.getCodigo()!= codigo) {
                    arrayVacunas.add(temp);
                }
            }
        } catch (Exception e) {
        } finally {
            cerrarArchivoInput();
            pasarArryTemporal_Archivo();
        }
    }
    
    public List<Vacunas> listado() throws Exception{
        arrayVacunas = new ArrayList<>();
        
        try {
            
                abrirArchivoInput();
                while (true) {
                    arrayVacunas.add((Vacunas) oLector.readObject());
                }
            
        } catch (Exception e) {
        } finally {
            cerrarArchivoInput();
        }
        return arrayVacunas;
    }
    
    
    
}
