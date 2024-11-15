
package Clases_Cita;


public enum tipoVacuna {
   TRIPLE_PERRO("Perro","Triple",4670),
   PARVOVIRUS_PERRO("Perro","Parvovirus",6500),
   REFUERZOTRIPLE_PERRO("Perro","Refuerzo Triple",4670),
   REFUERZO_RABIA_PERRO("Perro","Refuerzo Rabia",6500),
   RABIA_PERRO("Perro","Rabia",8765),
   TRIVALENTE_GATO("Gato","Trivalente", 5500),
   REFUERZO_TRIVALENTE_GATO("Gato","Refuerzo Trivalente",5500),
   RABIA_GATO("Gato","Rabia Gato",9000),
   LEUCEMIAFELINA_GATO("Gato","Leucemia Felina",4567),
   REFUERZO_LEUCEMIA_FELINA("Gato","Refuerzo Leucemia",4567);
   
   String animal;
   String descripcion;
   int costo;

    private tipoVacuna(String animal,String descripcion, int costo) {
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getAnimal() {
        return animal;
    }

    
    
    
   
   
}
