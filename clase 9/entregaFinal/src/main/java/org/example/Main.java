package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import  java.util.*;
public class Main {
    public static void main(String[] args) throws RuntimeException {

      GestorCSV gestorCSV = new GestorCSV();
      GestorDeProductoJDBC gestorDeProductoJDBC = new GestorDeProductoJDBC();


      System.out.println("Recuperando productos del CSV");
      ArrayList<Producto> productosRecuperados= null;
      try {
        productosRecuperados = gestorCSV.leerCSV("ruta del archivo");

        for (Producto producto: productosRecuperados) {
          System.out.println(producto);
        }

        gestorDeProductoJDBC.guardarProductosEnLaBaseDeDatos(productosRecuperados);


      } catch (ProductoException e) {
        throw new RuntimeException(e);
      }




      System.out.println("Generando productos en el CSV");

      try {
        ArrayList<Producto> productos = gestorDeProductoJDBC.recuperarProductosDeLaBaseDeDatos();

        gestorCSV.escribirCSV("ruta del archivo", productos);
      } catch (ProductoException e) {
        throw new RuntimeException(e);

      }





    }

}


