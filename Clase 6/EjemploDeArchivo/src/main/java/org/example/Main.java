package org.example;

import java.io.*;
public class Main {
    public static void main(String[] args) {


        File file = new File("C://Users/Fernando/Desktop/Desarrollo web-/java/Beca Compromiso - Municipalidad - UVE UTN/Clase 6/ejemplo.txt");
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write("Hola a todoos  de nuevo\n");
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if (fileWriter != null){
                try {
                    fileWriter.close();
                } catch (IOException e){}

             }
            }

        System.out.println("*****************************");

        FileReader fileLeer = null;

        try {
            fileLeer = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileLeer);
            String leerLinea = bufferedReader.readLine();
            while (leerLinea != null){
                System.out.println(leerLinea);
                leerLinea = bufferedReader.readLine();
            }
            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null){
                try {
                    fileLeer.close();
                } catch (IOException e){}
            }

        }


    }
}