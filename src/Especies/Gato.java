
package Especies;


public class Gato extends ClasesPaciente.Especie{
    private String descripcion;
    
    public Gato(String descripcion) {
        super(descripcion);
        this.descripcion = descripcion;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Override
    public String getDescripcion() {
      return this.descripcion;
    }
    
}
