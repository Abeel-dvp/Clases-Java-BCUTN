package org.example;

public class Empleado extends Persona{
    private  Double sueldo;

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public void saludar() {
        System.out.println("saludo como persona pero soy empleado");
    }
}

