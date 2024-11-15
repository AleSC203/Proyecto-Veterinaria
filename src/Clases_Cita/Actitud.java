
package Clases_Cita;


public class Actitud {
    private String descripcion;

    public Actitud(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String actitudMascota(String actitudP){
        //Supongo que tendre que hacer algun proceso mas adelante
        String feeling = "";
        if (actitudP.equalsIgnoreCase("Excitado")) {
            feeling = "Excitado";
        }
        
        else if (actitudP.equalsIgnoreCase("Deprimido")) {
             feeling = "Deprimido";
        }
        
        else if (actitudP.equalsIgnoreCase("postrado")) {
            feeling = "postrado";
        }
        return feeling;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Actitud{");
        sb.append("descripcion=").append(descripcion);
        sb.append('}');
        return sb.toString();
    }
    
    
}
