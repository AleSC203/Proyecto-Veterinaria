/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import Clases_Cita.PruebaLaboratorio;
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
public class pruebaLabDAO {
    //ruta del archivo
    //System.getProperty("user.dir") ruta de trabajo del proyecto
    private final String RUTA_ARCHIVO = System.getProperty("user.dir")+ "\\src\\Archivo\\Nacionalidad.txt";//buscar ruta
    
    //leer y escribir en los archivos
    private ObjectOutputStream oEscritor;
    private ObjectInputStream oLector;
    
    //abrir los archivos de lectura y escritura
    private FileOutputStream oFileOutputStream;
    private FileInputStream oFileInputStream;
    
    //para los metodos de modificar y eliminar
    private List<PruebaLaboratorio> arrayNacionalidad;
    
    //patron Singleton
    //Patron singleton permite tener una unica instancia de un objeto
    private static pruebaLabDAO instance = null;
    
    //constructor sin nada
    private pruebaLabDAO(){
        
    }
    
    
    public static pruebaLabDAO getInstance(){
        if (instance == null) {
            instance = new pruebaLabDAO();
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
    public void agregar(PruebaLaboratorio pruebaLab)throws Exception{
        
        try {
            
                this.abrirArchivoOutput();
                
                if (oEscritor != null) {
                    
                    //escribir el objeto en el archivo
                    oEscritor.writeObject(pruebaLab);
                    
                    //Limpiar el buffer para dejar los datos fijos en el archivo
                    oEscritor.flush();
                    
                    //por lo que entiendo el write los escrive en el archivo pero no del todo sino que lo deja
                    //en un estado congelado y el flush lo guarda permanentemente 
                }
                

        } catch (Exception e) {
            throw e;
        }
        finally{
            this.cerrarArchivoOutput();
            //Siempre se ejucuta el finally de esta manera siempre nos aseguraremos de cerrar correctamente los archivos
        }
    }
    
    
    
    public PruebaLaboratorio consultar(int codigo)throws Exception{
        PruebaLaboratorio oRetornar = null;
        
        try {
                this.abrirArchivoInput();
                //while hasta generar error
                while (true) {
                    oRetornar = (PruebaLaboratorio)oLector.readObject();
                    if (oRetornar.getNumPrueba()== codigo) {
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
        
        
        if (!arrayNacionalidad.isEmpty()) {
            
            this.abrirArchivoOutput();
            for (PruebaLaboratorio nacionalidad : arrayNacionalidad) {
                oEscritor.writeObject(nacionalidad);
            }
            oEscritor.flush();
        }
        
        this.cerrarArchivoOutput();
         
    }
    
    
    
    public void modificar(PruebaLaboratorio pruebaLab)throws Exception{
        arrayNacionalidad = new ArrayList<>();
        
        try {
            
                abrirArchivoInput();
                PruebaLaboratorio temp = null;
                while (true) {
                    
                    temp = (PruebaLaboratorio)oLector.readObject();
                    
                    if (temp.getNumPrueba()== pruebaLab.getNumPrueba()) {
                       temp = pruebaLab;
                    }
                     arrayNacionalidad.add(temp);
                }
        
        } catch (Exception e) {
        } finally {
            cerrarArchivoInput();
            pasarArryTemporal_Archivo(); //crea el archivo con la modificacion
             //Siempre se ejucuta el finally de esta manera siempre nos aseguraremos de cerrar correctamente los archivos
        }
    }
    
    
    
    public void eliminar(int codigo)throws Exception{
        arrayNacionalidad = new ArrayList<>();
        try {
            abrirArchivoInput();
            PruebaLaboratorio temp = null;
            while (true) {
                temp = (PruebaLaboratorio)oLector.readObject();
                if (temp.getNumPrueba()!= codigo) {
                    arrayNacionalidad.add(temp);
                }
            }
        } catch (Exception e) {
        } finally {
            cerrarArchivoInput();
            pasarArryTemporal_Archivo();
        }
    }
    
    public List<PruebaLaboratorio> listado() throws Exception{
        arrayNacionalidad = new ArrayList<>();
        
        try {
            
                abrirArchivoInput();
                while (true) {
                    arrayNacionalidad.add((PruebaLaboratorio) oLector.readObject());
                }
            
        } catch (Exception e) {
        } finally {
            cerrarArchivoInput();
        }
        return arrayNacionalidad;
    }
    
}
