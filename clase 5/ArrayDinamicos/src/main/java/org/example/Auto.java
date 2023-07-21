package org.example;

import java.util.Objects;

public class Auto {

    private  String patente;
    private String marca;
    private String modelo;
    private  Persona persona;


    public Auto(String patente, String marca, String modelo) {
        super();
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return Objects.equals(patente, auto.patente) && Objects.equals(marca, auto.marca) && Objects.equals(modelo, auto.modelo) && Objects.equals(persona, auto.persona);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patente, marca, modelo, persona);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", persona=" + persona +
                '}';
    }
}
