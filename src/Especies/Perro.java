
package Especies;


public class Perro extends ClasesPaciente.Especie{
    private String descripcion;
    public Perro(String descripcion) {
        super(descripcion);
        this.descripcion = descripcion;
    }

    @Override
    public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
    }

    @Override
    public String getDescripcion() {
       return descripcion;
    }
    
}
