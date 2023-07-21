package org.example;

import java.io.File;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio del programa");



        EjemploDeOtraClase ejemploDeOtraClase = new EjemploDeOtraClase();

        try {
            System.out.println("Inicio del try");
                ejemploDeOtraClase.hacerAlgoMalConArchivos();

            /*
            EjemploDeOtraClase ejemploDeOtraClase = new EjemploDeOtraClase();
            ejemploDeOtraClase.hacerAlgoMal();*/
            /*
            String textNull = "Hola...";//null;
            Integer [] numeros = new Integer[2];
            numeros[0] = 232;
            numeros[1] = 332;
           // numeros[2] = 132;

            Integer total = 10000/0; */
            System.out.println("Fin del try");
        } catch (NullPointerException e){
            System.out.println("Estoy en NullPointerException");
            System.out.println("Mensaje: " + e.getMessage());
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Estoy en  ArrayIndexOutOfBoundsException");
            System.out.println("Mensaje: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("Estoy en Exception, error al grabar archivo");
            System.out.println("Mensaje: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Estoy en el Finally, siempre me ejecuto");
        }


        System.out.println("Fin del programa");

    }
}