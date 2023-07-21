import  java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        PersonasDAO personasDAO = new PersonasDAO();
        /*  Persona persona = new Persona(0L, "juanardo", "Perez", 34);
        personasDAO.guardarPesonas(persona);
*/
        ArrayList<Persona> personas = null;
        try {
            personas = personasDAO.recuperarPersonas();

            for (Persona persona1 : personas){
                System.out.println(persona1);
            }


            Persona persona = new Persona(3L , "XXXXXX", "YYYYYY", 33);
            personasDAO.actualizarPersona(persona);

            Persona personaRecuperada = personasDAO.buscarPersonaPorId(6L);
            System.out.println(personaRecuperada);

            personasDAO.borrarPersona(3L);

        } catch (PersonaException e) {
            throw new RuntimeException(e);
        }


    }
}