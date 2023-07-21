package org.example;

public class Main {
    public static void main(String[] args) {
        // NO puedo crear una persona porquue es abstracta
        //  Persona persona = new Persona()

        Empleado empleado1 = new Empleado();
        empleado1.saludar();

        Director director1 = new Director();
        director1.saludar();
    }


}

