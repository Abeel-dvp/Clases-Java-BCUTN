package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona(123445612, "Juan","pere");
        Persona persona2 = new Persona(144562212, "Patricio","estrella");
        Persona persona3 = new Persona(1234456312, "Bob","esponja");
        Persona persona4 = new Persona(1234456312, "Bob","esponja");

        Auto auto1 = new Auto("XTT332", "BMW","2005");
        Auto auto2 = new Auto("XTY321", "Mercedez","2005");

        persona1.agregarNuevoAuto(auto1);
        persona1.agregarNuevoAuto(auto2);
        persona1.agregarNuevoAuto(auto2);

        persona1.listarAutos();

        // 1:10:16 quede


    }
}