
package HijasPruebasLaboratorio;

import java.io.Serializable;

public class Sangre extends Clases_Cita.PruebaLaboratorio implements Serializable {

    private String nombrePrueba;//Contendra el nonbre de la subClase
    private double costo;

    public Sangre() {
        super("Sangre", 0);
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
