package org.example;

import java.security.Principal;
import  java.sql.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;

public class Main {


    private static final Logger logger = LogManager.getLogger(Principal.class);

    public static void main(String[] args) {


        logger.info("Iniciando mi programa de ejemplo de personas...");

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
           logger.error("Hay un error general al trabajar con las personas", e);
        }


    }
}