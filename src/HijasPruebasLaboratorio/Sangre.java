
package HijasPruebasLaboratorio;

import java.io.Serializable;

public class Sangre extends Clases_Cita.PruebaLaboratorio implements Serializable {

    private String nombrePrueba;//Contendra el nonbre de la subClase
    private double costo;
    private int codigo;

    public Sangre() {
        super("Sangre", 3200, 1);
        this.nombrePrueba = "Sangre";
        this.costo = 3200;
        this.codigo = 1;
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

    @Override
    public int getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(int codigoP) {
        this.codigo = codigoP;
    }

    
    
    
}
