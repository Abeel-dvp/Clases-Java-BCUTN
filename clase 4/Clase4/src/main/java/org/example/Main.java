package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        //File unArchivo = new File("C:Users/MiUsuario/ejemplo.txt"); EJEMPLO DE WINDOWS
       File unArchivo = new File("/ejemplo.txt"); //busca un archivo, en la carpeta asignada
       if (unArchivo.exists()){// Exist se fija si esta o no...
           System.out.println("El archivo existe");
           System.out.println("Tamaño: "+ unArchivo.length()); //indica el tamaño(si es que existe)

       } else {
           System.out.println("El archivo no esta... ");
       }

       FileWriter fileWriter= null;
       try{
           System.out.println("Creo un archivo en try");
        fileWriter= new FileWriter(unArchivo); //CREO UN ARCHIVO si no existe
            fileWriter.write("Ejemplo de contenido generado desde java..");
            fileWriter.close(); // ojo q el close no tiene q estar aca
       } catch (IOException e){
           System.out.println("HAy un error en general al grabar el archivo");
            e.printStackTrace();
       }    finally { //limpia recursos o cierra archivos
           System.out.println("Llego al finally...");
           if (fileWriter !=null){
             try {
                 fileWriter.close();
             } catch (IOException e) {
                 System.out.println("Error");
             }

           }
       }

        System.out.println("Fin del programa");
    }
}