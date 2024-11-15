
package ClasesPaciente;

import DAO.RazaDAO;
import java.util.List;
import javax.swing.JOptionPane;


public class Raza {
    //Para perros hay aproximadamente 343  y para gatos hay 100
private String tipoRaza; //Perro o gato
private String descripcion; //Este es el nombre 
private static int incremetaNumRaza = 0;
private int numeroRaza;

    public Raza(String tipoRaza, String descripcionP) {
        this.tipoRaza = tipoRaza;
        this.descripcion = descripcionP;
        numeroRaza = ++incremetaNumRaza;
        
    }

    public Raza() {
    }
    

    public String getTipoRaza() {
        return tipoRaza;
    }

    public void setTipoRaza(String tipoRaza) {
        this.tipoRaza = tipoRaza;
    }

    public int getNumeroRaza() {
        return numeroRaza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("tipoRaza: ").append(tipoRaza);
        sb.append("  #: ").append(numeroRaza);
       
        return sb.toString();
    }
    
    
    
    //BLL
    public static void agregar(Raza nombreRaza) throws Exception{
        RazaDAO.getInstance().agregar(nombreRaza);
        JOptionPane.showMessageDialog(null, "Se ha creado con exito");
    }
    public static void modificar(Raza nombreRaza) throws Exception{
        RazaDAO.getInstance().modificar(nombreRaza);
         JOptionPane.showMessageDialog(null, "Se ha modificado con exito");
    }
    public static void eliminar(int codigo) throws Exception{
        RazaDAO.getInstance().eliminar(codigo);
         JOptionPane.showMessageDialog(null, "Se ha Eliminado con exito");
    }
    public static Raza consultar(String nombreRaza)throws Exception{
        return RazaDAO.getInstance().consultar(nombreRaza);
    }
    public static List<Raza> listado() throws Exception{
        return RazaDAO.getInstance().listado();
    }
    public static void cambiarRuta(String animal){
        RazaDAO.getInstance().setRuta_Archivo(animal);
    }



}
