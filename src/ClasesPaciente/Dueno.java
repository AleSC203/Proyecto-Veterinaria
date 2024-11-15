
package ClasesPaciente;


public class Dueno {
    private String direccion;
    private String nombre;
    private long telefono;

    public Dueno(String direccion, String nombre, long telefono) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    
    //Se debe modificar el toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dueno{");
        sb.append("direccion=").append(direccion);
        sb.append(", nombre=").append(nombre);
        sb.append(", telefono=").append(telefono);
        sb.append('}');
        return sb.toString();
    }
    
    
}
