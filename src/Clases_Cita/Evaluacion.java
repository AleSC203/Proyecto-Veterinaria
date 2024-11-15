
package Clases_Cita;


public class Evaluacion {
    private String descripcion;  // posibles opciones piel, ojos, orejas,membranas mucosas, dientes, nariz, pelo, piel, hidratación   PUEDEN SER VARIOS A LA VEZ
    private Estado estado;
    private StringBuffer observacion;//si la descripcion de la observacion (Estado) es anormal entonces se debe anotar en las observaciones

    public Evaluacion(String descripcion, Estado estado) {
        this.descripcion = descripcion;
        this.estado = estado;
        observacion = new StringBuffer();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

//    public StringBuffer getObservacion() {
//        return observacion;
//    }
//
//    public void setObservacion(StringBuffer observacion) {
//        this.observacion = observacion;
//    }
    
    
    
    
}
