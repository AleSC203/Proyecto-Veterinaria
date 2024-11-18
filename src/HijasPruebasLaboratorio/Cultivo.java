
package HijasPruebasLaboratorio;

import Clases_Cita.PruebaLaboratorio;
import java.io.Serializable;


public class Cultivo extends PruebaLaboratorio implements Serializable{
    private String nombreDePrueba; //este contendra las subClases de cultivo
    private double precio;
    
    public Cultivo() {
        super("Cultivo", 0);
       
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
