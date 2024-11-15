
package Clases_Cita;


public enum TipoMotivo {
   VACUNACION("Vacunacion",0),//Este lleva el precio de la vacuna
   DESPARASITACION("Desparacitacion",2000),
   CHEQUEOGENERAL("Chequeo Genaral",8000),
   ENFERMEDAD("Enfermedad",0),//Fijado por el medico
   CIRUGIA("Cirugia",0);//Fijado por el medico
   
  
   String descripcion;
   int costo;
   
    private TipoMotivo(String descripcion, int costoP) {
        costo = costoP;
        this.descripcion = descripcion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   
   
}
