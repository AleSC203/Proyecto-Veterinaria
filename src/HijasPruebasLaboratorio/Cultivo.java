
package HijasPruebasLaboratorio;

import Clases_Cita.PruebaLaboratorio;
import java.io.Serializable;


public class Cultivo extends PruebaLaboratorio implements Serializable{
    private String nombreDePrueba; //este contendra las subClases de cultivo
    private double precio;
    private int codigo;

    public Cultivo() {
        super("Cultivo", 4800, 4);
        nombreDePrueba = "Cultivo";
        precio = 4800;
        codigo = 4;
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

    @Override
    public int getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(int codigoP) {
        this.codigo = codigoP;
    }
    
}
