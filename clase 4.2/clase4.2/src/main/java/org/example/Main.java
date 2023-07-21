package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {



        Integer[] numerosInteger = new Integer[2];
        numerosInteger[0] = 20;
        numerosInteger[1] = 30;


        String [] textos = new String[3];
        textos[0] = "Texto1";
        textos[1] = "Texto2";
        textos[2] = "Texto3";


        manejoDeVectores manejoDeVectores = new manejoDeVectores();
        Integer total = manejoDeVectores.sumaDeNumEnteros(numerosInteger);

        System.out.println("El total es " + total);

        Boolean seEncontroElTexto = manejoDeVectores.buscarTexto(textos,"Maria");
        System.out.println("Esta MAria " + seEncontroElTexto);

       seEncontroElTexto = manejoDeVectores.buscarTexto(textos, "Texto2");
        System.out.println("Esta texto2 " + seEncontroElTexto);
    }
}