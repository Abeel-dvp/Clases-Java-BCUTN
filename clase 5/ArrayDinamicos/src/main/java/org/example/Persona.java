package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class Persona {
        private Integer dni;
        private String nombre;
        private String apellido;
        private ArrayList<Auto> autos = new ArrayList<Auto>();


    public Persona() {
    }

    public Persona(Integer dni, String nombre, String apellido) {
        super();
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }


    public void  agregarNuevoAuto(Auto auto){
       if(this.autos.contains(auto) == false){
           this.autos.add(auto);
           auto.setPersona(this);
       }
    }

    public void listarAutos(){
        for (Auto auto: autos){
            System.out.println(auto);
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni) && Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, nombre, apellido);
    }

    public ArrayList<Auto> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<Auto> autos) {
        this.autos = autos;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
