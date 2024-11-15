
package ClasesPaciente;


public abstract class Especie {
    private String descripcion;
    private static int codigo = 0;
    private int contadorCodigo;
    private Raza tipoRaza; //probando

    public Especie(String descripcion) {
        this.descripcion = descripcion; //Perro o gato
        this.contadorCodigo = ++codigo;
    }

    public abstract String getDescripcion() ;

    public abstract void setDescripcion(String descripcion);
    
     public int getContadorCodigo() {
        return contadorCodigo;
    }
     
     
    public Raza getTipoRaza() {
        return tipoRaza;
    }

    public void setTipoRaza(Raza tipoRaza) {
        this.tipoRaza = tipoRaza;
    }

   
}
