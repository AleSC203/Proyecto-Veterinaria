
package HijasPruebasLaboratorio;

public class Sangre extends Clases_Cita.PruebaLaboratorio {

    private String descripcion;
    private double costo;

    public Sangre(String descripcionP, double precioExamen) {
        super(descripcionP, precioExamen);
        this.descripcion = descripcionP;
        this.costo = precioExamen;
    }

    @Override
    public String getDescripcion() {
        return this.descripcion;
    }

    @Override
    public void setDescripcion(String descripcionP) {
        this.descripcion = descripcionP;
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
