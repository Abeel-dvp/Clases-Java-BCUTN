package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
public class GestorCSV {

    public  void escribirCSV(String rutaDelArchivo, ArrayList<Producto> productos) throws ProductoException {
            File archivoCSV = new File(rutaDelArchivo);
            FileWriter fileWriter = null;

            try {
                fileWriter = new FileWriter(archivoCSV);

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                for (Producto p: productos){
                    fileWriter.write(p.getId() + ";" + p.getNombre() + ";" + p.getDescripcion()+ ";" + p.getPrecio()+ ";"+ dateFormat.format(p.getFechaAlta()) + "\n");
                }

                fileWriter.close();
            } catch (Exception e){
                throw new ProductoException("Hay un error al escribir el CSV: "+ rutaDelArchivo ,e);
            } finally{
                if(fileWriter != null){
                    try {
                        fileWriter.close();
                    } catch (IOException e) {}
                }
            }
    }







    public  ArrayList<Producto>  leerCSV(String rutaDelArchivo) throws ProductoException {
        ArrayList<Producto> productos = new ArrayList<Producto>();
        FileReader fileReader = null;
        try {
            File archivoCSV = new File(rutaDelArchivo); //Genera un archivo
            fileReader = new FileReader(archivoCSV); // lee un conjunto de caracteres
            BufferedReader bufferedReader = new BufferedReader(fileReader); //para leer una linea completa
            String linea = bufferedReader.readLine();

            Integer contadorDeLinea = 0;
            while (linea != null) {

                System.out.println("linea actual: "+ linea);

                if (contadorDeLinea >=0 && !linea.isBlank()){
                    String[ ] registros = linea.split(";");
                    Integer id = Integer.parseInt(registros[0]);
                    String nombre = registros[1].trim();// borra los espacios
                    String descripcion = registros[2];
                    Double precio = Double.parseDouble(registros[3]);

                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

                    Date fechaAlta = null;

                    try {
                        fechaAlta = formato.parse(registros[4]);
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }

                    productos.add(new Producto(id, nombre, descripcion, precio, fechaAlta));

                } else {
                    System.out.println("la primer linea son los nombres de la columna");
                }





                linea = bufferedReader.readLine();
                contadorDeLinea = contadorDeLinea + 1;
            }
            fileReader.close();
        } catch (Exception e){

           throw  new ProductoException("Hay un problema al leer los datos del archivo CSV: " + rutaDelArchivo, e);
        } finally {
            if (fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {}
            }
        }

        return productos;
    }


}
