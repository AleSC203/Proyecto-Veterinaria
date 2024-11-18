
package HijasPruebasLaboratorio;

import java.io.Serializable;


public class Orina extends Clases_Cita.PruebaLaboratorio implements Serializable{
    private String nombrePrueba;//Este contendra el nombre de la subClase
    private double costo ;

    public Orina() {
        super("Orina", 0);
        
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
