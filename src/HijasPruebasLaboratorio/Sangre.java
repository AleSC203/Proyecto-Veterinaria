
package HijasPruebasLaboratorio;

public class Sangre extends Clases_Cita.PruebaLaboratorio {

    private String nombrePrueba;//Contendra el nonbre de la subClase
    private double costo;

    public Sangre(String nombrePruebaP, double precioExamen) {
        super(nombrePruebaP, precioExamen);
        this.nombrePrueba = nombrePruebaP;
        this.costo = precioExamen;
    }

    @Override
    public String getDescripcion() {
        return this.nombrePrueba;
    }

    @Override
    public void setDescripcion(String descripcionP) {
        this.nombrePrueba = descripcionP;
    }

    @Override
    public double getPrecio() {
        return this.costo;
    }

    @Override
    public void setPrecio(double precio) {
        this.costo = precio;
    }

    
    
    
}
