
package HijasPruebasLaboratorio;


public class Orina extends Clases_Cita.PruebaLaboratorio{
    private String nombrePrueba;//Este contendra el nombre de la subClase
    private double costo ;

    public Orina(String nombrePrueba, String descripcion, double precioExamen) {
        super(descripcion, precioExamen);
        this.nombrePrueba = nombrePrueba;
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
