package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> nombreList = new ArrayList<String>();

        nombreList.add("Juan");
        nombreList.add("Maria");
        nombreList.add("Lucas");
        nombreList.add("Juan");

        System.out.println("Cantidad de valores List : " + nombreList.size());

        for (String nombre : nombreList){
            System.out.println(nombre);
        }

        System.out.println("******************");

        HashSet <String> nombreSet = new HashSet<String>();
        nombreSet.add("Juan");
        nombreSet.add("Maria");
        nombreSet.add("Lucas");
        nombreSet.add("Juan");

        System.out.println("Cantidad de valores en Hashset" + nombreSet.size());





        for ( String nombre : nombreSet){
            System.out.println(nombre);
        }

        String nombreX = "Juan";
        System.out.println(nombreX.hashCode());
        Integer numeroX= 123;
        System.out.println(numeroX.hashCode());

        System.out.println("***************************");

        // ORDENA LOS NUMEROS PROGRESIVAMENTE
        TreeSet<Integer> numerosOrdenados = new TreeSet<Integer>();
        numerosOrdenados.add(45);
        numerosOrdenados.add(11);
        numerosOrdenados.add(9);
        numerosOrdenados.add(98);

        for (Integer numero : numerosOrdenados){
            System.out.println(numero);
        }

        System.out.println("*********************");

        //ORDENO EL NOMBRE ALFABETICAMENTE
        TreeSet<String> nombresOrdenados = new TreeSet<String>();
        nombresOrdenados.add("juan");
        nombresOrdenados.add("ariel");
        nombresOrdenados.add("lucas");
        nombresOrdenados.add("martin");

        for (String nombre : nombresOrdenados){
            System.out.println(nombre);
        }

        System.out.println("*************************************");
        /// x--> x --> Lista enlazada
        LinkedList<String> nombreLinkedList = new LinkedList<String>();
        nombreLinkedList.add("juan");
        nombreLinkedList.add("maria");
        nombreLinkedList.add("juan");
        nombreLinkedList.add("Lucas");

        System.out.println("Cantidad nombresLinkedList " + nombreLinkedList.size());

        for (String nombre : nombreLinkedList) {
            System.out.println(nombre);
        }


        System.out.println("*********************************");

        HashMap <Integer, String> nombresPorDNI = new HashMap<Integer,String>();

        nombresPorDNI.put(387771,"jorge");
        nombresPorDNI.put(38733,"Lucas");
        nombresPorDNI.put(3823221,"Pedro");

        String nombreEncontrado = nombresPorDNI.get(38771);
        System.out.println(nombreEncontrado);






    }



}