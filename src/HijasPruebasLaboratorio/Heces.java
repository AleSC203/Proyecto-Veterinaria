package HijasPruebasLaboratorio;

public class Heces extends Clases_Cita.PruebaLaboratorio {

    private String Descripcion;
    private double costo;

    public Heces(String Descripcion, String descripcion, double precioExamen) {
        super(descripcion, precioExamen);
        this.Descripcion = Descripcion;
        this.costo = precioExamen;
    }

    @Override
    public String getDescripcion() {
        return this.Descripcion;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
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
