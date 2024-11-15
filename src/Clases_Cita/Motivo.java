
package Clases_Cita;

import ClasesPaciente.Raza;
import DAO.MotivoDAO;
import DAO.RazaDAO;
import java.util.List;


public class Motivo {
    private boolean aplicaExamen;
    private String descripcion; 
    private double precio;
    private int codigo;
    private static int codigoContador = 0;
    private tipoVacuna vacuna;

    public Motivo(boolean aplicaExamen, String descripcion, double precio, tipoVacuna vacunaP) {
        this.aplicaExamen = aplicaExamen;
        this.descripcion = descripcion;
        this.precio = precio;
        this.codigo = ++codigoContador;
        this.vacuna = vacunaP;
        
    }

    public boolean isAplicaExamen() {
        return aplicaExamen;
    }

    public void setAplicaExamen(boolean aplicaExamen) {
        this.aplicaExamen = aplicaExamen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public tipoVacuna getVacuna() {
        return vacuna;
    }

    public void setVacuna(tipoVacuna vacuna) {
        this.vacuna = vacuna;
    }
    
    
    public double costoCosnsulta(String motivo){
        double costo = 0;
        
        if (motivo.equalsIgnoreCase("Vacunacion")) {
           //Depende de la Vacuna 
        }
        else if (motivo.equalsIgnoreCase("Desparacitacion")) {
            costo = 2000;
        }
        else if (motivo.equalsIgnoreCase("Chequeo General")) {
            costo = 8000;
        }
        else if (motivo.equalsIgnoreCase("Enfermedad")) {
           //Fijado por el medico
        }
        else if (motivo.equalsIgnoreCase("Cirugia")) {
           //Fijado por el medico
        }
        
        return costo;
    }
    
    public boolean aplicaExamen(String motivo){
        
        if (motivo.equalsIgnoreCase("Chequeo General") || motivo.equalsIgnoreCase("enfermedad") || motivo.equalsIgnoreCase("cirugia")) {
            return true;
        }
        return false;
    }
    
    //BLL
    public static void agregar(Motivo pValor) throws Exception{
        MotivoDAO.getInstance().agregar(pValor);
    }
    public static void modificar(Motivo pValor) throws Exception{
        MotivoDAO.getInstance().modificar(pValor);
    }
    public static void eliminar(int codigo) throws Exception{
        MotivoDAO.getInstance().eliminar(codigo);
    }
    public static Motivo consultar(int codigo)throws Exception{
        return MotivoDAO.getInstance().consultar(codigo);
    }
    public static List<Motivo> listado() throws Exception{
        return MotivoDAO.getInstance().listado();
    }
}
