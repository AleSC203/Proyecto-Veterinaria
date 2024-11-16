
package Clases_Cita;


public enum tipoVacuna {
   Triple_Perro("Perro","Triple",4670),
   Parvovirus_Perro("Perro","Parvovirus",6500),
   Refuerzo_Triple_Perro("Perro","Refuerzo Triple",4670),
   Refuerzo_Rabia_Perro("Perro","Refuerzo Rabia",6500),
   Rabia_Perro("Perro","Rabia",8765),
   Trivalente_Gato("Gato","Trivalente", 5500),
   Refuerzo_Trivalente_Gato("Gato","Refuerzo Trivalente",5500),
   Rabia_Gato("Gato","Rabia Gato",9000),
   Leucemia_Gato("Gato","Leucemia Felina",4567),
   Refuerzo_Leucemia_Felina_Gato("Gato","Refuerzo Leucemia",4567);
   
   String animal;
   String descripcion;
   int costo;

    private tipoVacuna(String animal,String descripcion, int costo) {
        this.descripcion = descripcion;
        this.costo = costo;
        this.animal = animal;
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
