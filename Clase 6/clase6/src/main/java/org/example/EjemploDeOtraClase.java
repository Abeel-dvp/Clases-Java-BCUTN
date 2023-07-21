package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploDeOtraClase {

    public void hacerAlgoMal(){
        String texto = null;
        String textoUpper = texto.toUpperCase();
    }

    public void hacerAlgoMalConArchivos() throws MiPropiaException {

        File file = new File("c:/nose/notoy.txt");
        FileWriter escribirFile = null;
        try {
            escribirFile= new FileWriter(file);
            escribirFile.write("Algo de texto");
        } catch (IOException e){
            System.out.println("Algo salio mal...");
            throw new MiPropiaException("Hay un problema al guardar el archivo", e);
        } finally {
            try {
               if(escribirFile !=null) {
                   escribirFile.close();
               }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
