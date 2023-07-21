package org.example.principal;

import org.example.cuentas.CajaDeAhorro;
import org.example.cuentas.CuentaBancaria;
import org.example.cuentas.CuentaCorriente;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();


        CuentaBancaria cuentaBancaria1 = new CuentaBancaria();
        cuentaBancaria1.setNumeroDeCuenta(12333223L);
        cuentaBancaria1.setSaldoActual(40000.0);

        //System.out.println(cuentaBancaria1);

        CajaDeAhorro cajaDeAhorro = new CajaDeAhorro();
        cajaDeAhorro.setNumeroDeCuenta(4333222L);
        cajaDeAhorro.setSaldoActual(90000.0);
        //cajaDeAhorro.extraer(3000.0);
        //cajaDeAhorro.extraer(90000.0);
        //System.out.println(cajaDeAhorro);

        CuentaCorriente cuentaCorriente = new CuentaCorriente();
        cuentaCorriente.setNumeroDeCuenta(43333434L);
        cuentaCorriente.setSaldoActual(60000.0);
        cuentaCorriente.setLimiteExtra(90000.0);

        banco.extraerDeCuentaBancaria(cuentaCorriente, 110000.0);
        banco.extraerDeCuentaBancaria(cuentaBancaria1, 200000.0);
        banco.extraerDeCuentaBancaria(cajaDeAhorro, 2000.0);
       // cuentaCorriente.extraer(110000.0);

        //System.out.println(cuentaCorriente);

    }


}