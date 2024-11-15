
package Clases_Cita;


public enum Estado {
    NORMAL ("Normal"),
    ANORMAL("Anormal");
    
    private final String descripcion;

    private Estado(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
