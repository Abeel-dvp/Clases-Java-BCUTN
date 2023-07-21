package org.example;

public class Main {
    public static void main(String[] args) {

       Persona persona1 = new Persona("Juan","roque",15);
        System.out.println(persona1);

        Persona persona2 = new Persona("Roger","Feferer",23);
        System.out.println(persona2);

     Persona personaSinDatos = new Persona();
        System.out.println(personaSinDatos);

        persona1.saludar("Jorge");
        persona2.saludar();

    }

}