
package Clases_Cita;
import java.util.*;

public abstract class PruebaLaboratorio {

    private static int cantPrueba;//Es para que no se repitan las pruebas   
    private int numPrueba;
    private double precioExamen;
    private String nombrePrueba;
    private static int precioFinal;
    private ArrayList<PruebaLaboratorio> arrayPruebas;
    

    public PruebaLaboratorio(String descripcion, double precioExamen ) {
        this.numPrueba = ++cantPrueba;
        this.precioExamen = precioExamen;
        this.nombrePrueba = descripcion;
        this.arrayPruebas = new ArrayList<>();

    }

    public void agregarEnArray(PruebaLaboratorio obj){
        if (obj != null) {
            this.arrayPruebas.add(obj);
        }
    }
    
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

    public static void cambiarPrecioFinal(int precioFinalP){
        precioFinal = precioFinalP;
    }
    public static int obtenerPrecioFinal(){
        return precioFinal;
    }

}
