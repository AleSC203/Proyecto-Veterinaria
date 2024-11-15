
package Clases_Cita;


public abstract class PruebaLaboratorio {

    private static int cantPrueba;//Es para que no se repitan las pruebas   
    private int numPrueba;
    private double precioExamen;
    private String descripcion;

    public PruebaLaboratorio(String descripcion, double precioExamen) {
        this.numPrueba = ++cantPrueba;
        this.precioExamen = 0;

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


}
