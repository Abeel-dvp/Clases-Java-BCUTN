package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("FOR AL ARRAY LIST");
        ArrayList<String> nombresDinamicos = new ArrayList<String>();

        nombresDinamicos.add("Juan");
        nombresDinamicos.add("Pedro");
        nombresDinamicos.add("Maria");

    for (String nombre: nombresDinamicos){
        System.out.println(nombre);
    }


        String unNombre = "Juan";

        String[] nombres = new String[3];
        nombres[0] ="Juan";
        nombres[1]= "Pedro";
        nombres[2]= "Maria";

        System.out.println("FOR NORMAL PARA RECORRER EL VECTOR");
        for (int i=0; i<nombres.length; i++){
            String nombreTemporal = nombres[i];
            System.out.println(nombreTemporal);
        }

        System.out.println("***************");
        System.out.println("FOR EACH");

        for ( String nombre:
            nombres ) {
            System.out.println(nombre);

        }

        System.out.println("FOR EACH DE VECTOR DE NUMEROS");
        Integer [] numeros = {123, 323, 23, 43};

        for (Integer num : numeros){
            System.out.println(num);
        }

        //OBJETO : SE PUEDEN GUARDAR CUALQUIER TIPO DE DATOS;
        Object[] cosas = new Object[3];
        cosas[0]= 123423;
        cosas[1]= "Maria";
        cosas[2]= 123.3;

        System.out.println("FOR AL OBJECT");
        for (Object algo:
           cosas  ) {
            System.out.println(algo);
        }


        System.out.println("**********************");
        System.out.println("**********************");
        System.out.println("                       ");

        //NUEVO EJERCICIO

        System.out.println("NUEVO EJERCICIO CON LA CLASE PERSONA");

        ArrayList<Persona> personaDinamicas = new ArrayList<Persona>();

        personaDinamicas.add(new Persona("juan","perez","33333222333"));
        personaDinamicas.add(new Persona("jeferez","locue","44334333434"));
        personaDinamicas.add(new Persona("roberto","toto","22222333222"));

        for (Persona persona1: personaDinamicas){
            System.out.println(persona1);
        }



    }
}