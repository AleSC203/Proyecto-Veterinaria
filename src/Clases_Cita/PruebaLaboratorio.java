
package Clases_Cita;

import DAO.VacunasDAO;
import DAO.pruebaLabDAO;
import java.io.Serializable;
import java.util.*;
import javax.swing.JOptionPane;

public abstract class PruebaLaboratorio implements Serializable {

    private static int cantPrueba;//Es para que no se repitan las pruebas   
    private int numPrueba;
    private double precioExamen;
    private String nombrePrueba;
    private static int precioFinal;
    private int codigo;

    public PruebaLaboratorio(String descripcion, double precioExamen, int codigoP) {
        this.numPrueba = ++cantPrueba;
        this.precioExamen = precioExamen;
        this.nombrePrueba = descripcion;
        this.codigo = codigoP;

    }

    public abstract int getCodigo();

    public abstract void setCodigo(int codigo);

    public int getNumPrueba() {
        return numPrueba;
    }

    public void setNumPrueba(int numPrueba) {
        this.numPrueba = numPrueba;
    }

    public abstract double getPrecio();

    public abstract void setPrecio(double precio);

    public abstract String getDescripcion();

    public abstract void setDescripcion(String descripcion);

    public static void cambiarPrecioFinal(int precioFinalP) {
        precioFinal = precioFinalP;
    }

    public static int obtenerPrecioFinal() {
        return precioFinal;
    }
    
    

    public static void agregar(PruebaLaboratorio prueba) throws Exception {
        new pruebaLabDAO().agregar(prueba);
        JOptionPane.showMessageDialog(null, "Se ha creado con exito");
    }

    public static List<PruebaLaboratorio> consultarArray() throws Exception {
        return  new pruebaLabDAO().consultarArray();
    }

    public static void modificar(PruebaLaboratorio prueba) throws Exception {
        pruebaLabDAO.getInstance().modificar(prueba);
        JOptionPane.showMessageDialog(null, "Se ha modificado con exito");
    }

    public static void eliminar(int codigo) throws Exception {
        pruebaLabDAO.getInstance().eliminar(codigo);
        JOptionPane.showMessageDialog(null, "Se ha Eliminado con exito");
    }

    public static PruebaLaboratorio consultar(String codigo) throws Exception {
        return pruebaLabDAO.getInstance().consultar(codigo);
    }

    public static List<PruebaLaboratorio> listado() throws Exception {
        return pruebaLabDAO.getInstance().listado();
    }

}
