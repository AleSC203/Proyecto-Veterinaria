package HijasPruebasLaboratorio;

public class Heces extends Clases_Cita.PruebaLaboratorio {

    private String nombrePrueba; //Este contendra el nombre de la subClase
    private double costo;

    public Heces(String nombrePruebaP, String descripcion, double precioExamen) {
        super(descripcion, precioExamen);
        this.nombrePrueba = nombrePruebaP;
        this.costo = precioExamen;
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
