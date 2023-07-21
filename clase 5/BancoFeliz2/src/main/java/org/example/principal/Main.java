package org.example.principal;

import org.example.cuentas.CajaDeAhorro;
import org.example.cuentas.CuentaBancaria;
import org.example.cuentas.CuentaCorriente;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();



        CajaDeAhorro cajaDeAhorro = new CajaDeAhorro();
        cajaDeAhorro.setNumeroDeCuenta(4333222L);
        cajaDeAhorro.setSaldoActual(90000.0);

        CajaDeAhorro cajaDeAhorro2 = new CajaDeAhorro();
        cajaDeAhorro2.setNumeroDeCuenta(1114333222L);
        cajaDeAhorro2.setSaldoActual(90000.0);


        CuentaCorriente cuentaCorriente = new CuentaCorriente();
        cuentaCorriente.setNumeroDeCuenta(43333434L);
        cuentaCorriente.setSaldoActual(60000.0);
        cuentaCorriente.setLimiteExtra(90000.0);

       // banco.extraerDeCuentaBancaria(cuentaCorriente, 110000.0);

       // banco.extraerDeCuentaBancaria(cajaDeAhorro, 2000.0);

        System.out.println("*************************************");
        System.out.println("*************************************");
        System.out.println("*************************************");

        Cliente cliente1 = new Cliente();
        cliente1.agregarCuentaBancaria(cajaDeAhorro);
        cliente1.agregarCuentaBancaria(cajaDeAhorro2);
        cliente1.agregarCuentaBancaria(cuentaCorriente);
        cliente1.setNumeroDeCliente("233424");
        cliente1.listarCuentas();

        /*
        System.out.println("*************************************");
        System.out.println("*************************************");
        System.out.println("*************************************");

       // cliente1.quitarCuentaBancaria(43333434L);

      //  cliente1.quitarCuentaBancaria(cajaDeAhorro);




        cliente1.agregarCuentaBancariaPorNumeroDeCuenta(cajaDeAhorro2);
        cliente1.listarCuentas();
        System.out.println("*************************************");
        System.out.println("*************************************");
        cliente1.quitarCuentaBancariaPorNumeroDeCuenta(1114333222L);
        cliente1.listarCuentas();
        */
    }


}