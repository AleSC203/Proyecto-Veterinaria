
package HijasPruebasLaboratorio;

import Clases_Cita.PruebaLaboratorio;


public class Cultivo extends PruebaLaboratorio{
    private String nombreDePrueba; //este contendra las subClases de cultivo
    private double precio;
    
    public Cultivo(String nombreDepruebaP, String descripcion, double precioExamen) {
        super(descripcion, precioExamen);
        this.nombreDePrueba = nombreDepruebaP;
        this.precio = precioExamen;
    }

     
    
    @Override
    public String getDescripcion() {
        return nombreDePrueba;
    }

    @Override
    public void setDescripcion(String descripcion) {
       this.nombreDePrueba = descripcion;
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
