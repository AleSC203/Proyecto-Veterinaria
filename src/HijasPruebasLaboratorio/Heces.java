package HijasPruebasLaboratorio;

import java.io.Serializable;

public class Heces extends Clases_Cita.PruebaLaboratorio implements Serializable{

    private String nombrePrueba; //Este contendra el nombre de la subClase
    private double costo;

    public Heces() {
        super("Heces", 0);
    }

    @Override
    public String getDescripcion() {
        return this.nombrePrueba;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.nombrePrueba = descripcion;
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
