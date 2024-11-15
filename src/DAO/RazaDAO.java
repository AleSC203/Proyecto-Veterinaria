
package DAO;


import ClasesPaciente.Especie;
import ClasesPaciente.Raza;
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
public class RazaDAO {

    //ruta del archivo
    //System.getProperty("user.dir") ruta de trabajo del proyecto
    private String RUTA_ARCHIVO; //Debo buscar la ruta

// \\src\\Archivo\\Razas.txt
    //leer y escribir en los archivos
    private ObjectOutputStream oEscritor;
    private ObjectInputStream oLector;

    //abrir los archivos de lectura y escritura
    private FileOutputStream oFileOutputStream;
    private FileInputStream oFileInputStream;

    //para los metodos de modificar y eliminar
    private List<Raza> arrayRazas;

    //patron Singleton
    //Patron singleton permite tener una unica instancia de un objeto
    private static RazaDAO instance = null;

    //constructor sin nada
    private RazaDAO() {

    }

    public static RazaDAO getInstance() {
        if (instance == null) {
            instance = new RazaDAO();
        }
        return instance;
    }
    //finaliza el patron singleton

    public void abrirArchivoOutput() throws Exception {
        try {

            File oArchivo = new File(RUTA_ARCHIVO);
            if (oArchivo.exists()) {

                //abrir el archivo de acceso secuencial para escritura
                //sin el encabezado del objeto
                oFileOutputStream = new FileOutputStream(oArchivo, true);  //abre archivo lectura
                oEscritor = new MeObjectOutputStream(oFileOutputStream); //crea el objeto de escritura

            } else {
                //abrir el archivo de acceso secuencial para escritura
                //con el encabezado del objeto
                oFileOutputStream = new FileOutputStream(oArchivo, true);
                oEscritor = new ObjectOutputStream(oFileOutputStream);
            }

        } catch (IOException e) {
            throw e;
        }
    }

    public void abrirArchivoInput() throws Exception {

        try {

            oFileInputStream = new FileInputStream(RUTA_ARCHIVO); //abre el archivo de escritura
            oLector = new ObjectInputStream(oFileInputStream); //crea el objeto lector

        } catch (IOException e) {
            throw e;
        }
    }

    public void cerrarArchivoOutput() throws Exception {

        try {

            if (oEscritor != null) {
                oEscritor.close();
                oEscritor = null;
            }

        } catch (IOException e) {
            throw e;
        }
    }

    public void cerrarArchivoInput() throws Exception {
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
    public void agregar(Raza razaP) throws Exception {

        try {

            this.abrirArchivoOutput();

            if (oEscritor != null) {

                //escribir el objeto en el archivo
                oEscritor.writeObject(razaP);

                //Limpiar el buffer para dejar los datos fijos en el archivo
                oEscritor.flush();

                //por lo que entiendo el write los escrive en el archivo pero no del todo sino que lo deja
                //en un estado congelado y el flush lo guarda permanentemente 
            }

        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrarArchivoOutput();
            //Siempre se ejucuta el finally de esta manera siempre nos aseguraremos de cerrar correctamente los archivos
        }
    }

    public Raza consultar(String nombreRaza) throws Exception {
        Raza oRetornar = null;

        try {
            this.abrirArchivoInput();
            //while hasta generar error
            while (true) {
                oRetornar = (Raza) oLector.readObject();
                if (oRetornar.getTipoRaza().equalsIgnoreCase(nombreRaza)) {
                    return oRetornar;
                }
            }

        } catch (Exception e) { //no se pone nada porque el while genera error

        } finally {
            this.cerrarArchivoInput();
            //Siempre se ejucuta el finally de esta manera siempre nos aseguraremos de cerrar correctamente los archivos
        }
        return null;
    }

    private void pasarArryTemporal_Archivo() throws Exception {
        File archivoOriginal = new File(RUTA_ARCHIVO);

        if (archivoOriginal.exists()) {
            archivoOriginal.delete();
        }

        if (!arrayRazas.isEmpty()) {

            this.abrirArchivoOutput();
            for (Raza raza : arrayRazas) {
                oEscritor.writeObject(raza);
            }
            oEscritor.flush();
        }

        this.cerrarArchivoOutput();

    }

    public void modificar(Raza razaP) throws Exception {
        arrayRazas = new ArrayList<>();

        try {

            abrirArchivoInput();
            Raza temp = null;
            while (true) {

                temp = (Raza) oLector.readObject();

                if (temp.getNumeroRaza() == razaP.getNumeroRaza()) {
                    temp = razaP;
                }
                arrayRazas.add(temp);
            }

        } catch (Exception e) {
        } finally {
            cerrarArchivoInput();
            pasarArryTemporal_Archivo(); //crea el archivo con la modificacion
            //Siempre se ejucuta el finally de esta manera siempre nos aseguraremos de cerrar correctamente los archivos
        }
    }

    public void eliminar(int numeroRaza) throws Exception {
        arrayRazas = new ArrayList<>();
        try {
            abrirArchivoInput();
            Raza temp = null;
            while (true) {
                temp = (Raza) oLector.readObject();
                if (temp.getNumeroRaza() != numeroRaza) {
                    arrayRazas.add(temp);
                }
            }
        } catch (Exception e) {
        } finally {
            cerrarArchivoInput();
            pasarArryTemporal_Archivo();
        }
    }

    public List<Raza> listado() throws Exception {
        arrayRazas = new ArrayList<>();

        try {

            abrirArchivoInput();
            while (true) {
                arrayRazas.add((Raza) oLector.readObject());
            }

        } catch (Exception e) {
        } finally {
            cerrarArchivoInput();
        }
        return arrayRazas;
    }

    public void setRuta_Archivo(String animal) {
        if (animal.equalsIgnoreCase("Gato")) {
            this.RUTA_ARCHIVO = System.getProperty("user.dir") + "D:\\Proyecto\\ProyectoVeterinaria\\src\\Archivos\\RazasGato.txt";
        } else if (animal.equalsIgnoreCase("Perro")) {
            this.RUTA_ARCHIVO = System.getProperty("user.dir") + "D:\\Proyecto\\ProyectoVeterinaria\\src\\Archivos\\RazasPerro.txt";
        }
    }

}
