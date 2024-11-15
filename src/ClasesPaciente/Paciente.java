
package ClasesPaciente;

import Clases_Cita.Cita;
import java.util.*;


public class Paciente {
    private Dueno dueno; //Puede tener varios animales pero los animales no pueden tener varios dueños
    private int edad; //Debe ir en años o meses
    private Especie especie;
    private Collection<Cita>historial_medico; //Se guardarán todas las citas en las cuales el respectivo paciente fue evaluado
    private String nombre;
    private int numPaciente; // le doy el valor del static
    private Sexo sexo;
    private static int pacientenNumero = 0;
    private Raza raza;//Puede ser ya una raza reconociada o puede ser un mixto
    
}
