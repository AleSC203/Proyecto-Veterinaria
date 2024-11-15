
package Clases_Cita;

//Esta clase NO VA ME CONFUNDI CON DUEÑO
public class Propietario {

    private String nombrePropietario;
    private String direccion;
    private String telefono;

    public Propietario(String nombrePropietario, String direccion, String telefono) {
        this.nombrePropietario = nombrePropietario;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Propietario{");
        sb.append("nombrePropietario=").append(nombrePropietario);
        sb.append(", direccion=").append(direccion);
        sb.append(", telefono=").append(telefono);
        sb.append('}');
        return sb.toString();
    }
    
    
}
