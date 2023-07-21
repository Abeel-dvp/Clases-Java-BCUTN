package org.example.principal;

import org.example.cuentas.CuentaBancaria;

public class Banco {

    /***
     *
     * Ejemplo de polimorfismo por parametros
     * @param cuentaBancaria
     * @param monto
     */
    public  void extraerDeCuentaBancaria(CuentaBancaria cuentaBancaria, Double monto){

       Class tipoClase= cuentaBancaria.getClass();
        System.out.println("Tipo de Clase: " + tipoClase.getName());
        cuentaBancaria.extraer(monto);
        System.out.println(cuentaBancaria);
    }
}
