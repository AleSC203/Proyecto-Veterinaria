
package HijasPruebasLaboratorio;

import java.io.Serializable;


public class Orina extends Clases_Cita.PruebaLaboratorio implements Serializable{
    private String nombrePrueba;//Este contendra el nombre de la subClase
    private double costo ;
    private int codigo;

    public Orina() {
        super("Orina", 3600, 2);
        this.nombrePrueba = "Orina";
        this.costo = 3600;
        this.codigo = 2;
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
