
package HijasPruebasLaboratorio;

import Clases_Cita.PruebaLaboratorio;


public class Cultivo extends PruebaLaboratorio{
    private String Descripcion;
    private double precio;
    
    public Cultivo(String Descripcion, String descripcion, double precioExamen) {
        super(descripcion, precioExamen);
        this.Descripcion = Descripcion;
        this.precio = precioExamen;
    }

     
    
    @Override
    public String getDescripcion() {
        return Descripcion;
    }

    @Override
    public void setDescripcion(String descripcion) {
       this.Descripcion = descripcion;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }

    @Override
    public void setPrecio(double precio) {
       this.precio = precio;
    }
    
}
