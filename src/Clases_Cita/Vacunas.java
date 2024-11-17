
package Clases_Cita;

import ClasesPaciente.Raza;
import DAO.RazaDAO;
import DAO.VacunasDAO;
import java.util.List;
import javax.swing.JOptionPane;


public class Vacunas {
   private String animalPertenece;
   private String nombreVacuna;
   private int costo;
   private static int contadorVacunas = 0;
   private int codigo;

    public Vacunas(String animalPertenece, String nombreVacuna, int costo) {
        this.animalPertenece = animalPertenece;
        this.nombreVacuna = nombreVacuna;
        this.costo = costo;
        this.codigo = ++contadorVacunas;
    }

    public String getAnimalPertenece() {
        return animalPertenece;
    }

    public void setAnimalPertenece(String animalPertenece) {
        this.animalPertenece = animalPertenece;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    public void setNombreVacuna(String nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    public static void agregar(Vacunas vacuna) throws Exception{
        VacunasDAO.getInstance().agregar(vacuna);
        JOptionPane.showMessageDialog(null, "Se ha creado con exito");
    }
    public static void modificar(Vacunas vacuna) throws Exception{
        VacunasDAO.getInstance().modificar(vacuna);
         JOptionPane.showMessageDialog(null, "Se ha modificado con exito");
    }
    public static void eliminar(int codigo) throws Exception{
        VacunasDAO.getInstance().eliminar(codigo);
         JOptionPane.showMessageDialog(null, "Se ha Eliminado con exito");
    }
    public static Vacunas consultar(String nombreVacuna)throws Exception{
        return VacunasDAO.getInstance().consultar(nombreVacuna);
    }
    public static List<Vacunas> listado() throws Exception{
        return VacunasDAO.getInstance().listado();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Le pertenece a un: ").append(animalPertenece + "\n");
        sb.append("Nombre de Vacuna: ").append(nombreVacuna+ "\n");
        sb.append("El costo de la Vacuna es: ").append(costo+ "\n");
        sb.append("El codig de la Vacuna es: ").append(codigo+ "\n");
        sb.append("\n");
        return sb.toString();
    }
    
    
   
   
}
