
package ClasesPaciente;


public enum Sexo {
   MACHO("Macho"),
   HEMBRA("Hembra");
   
   private final String descripcion;

    private Sexo(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
   
   
}
