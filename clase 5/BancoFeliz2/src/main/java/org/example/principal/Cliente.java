package org.example.principal;

import org.example.cuentas.CuentaBancaria;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Cliente {

    private ArrayList<CuentaBancaria> cuentaBancarias = new ArrayList<CuentaBancaria>();

    private HashMap<Long, CuentaBancaria> cuentasBancariasPorNumeroDeCuenta = new HashMap<Long, CuentaBancaria>();

    private  String nombre;
    private  String  numeroDeCliente;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroDeCliente() {
        return numeroDeCliente;
    }

    public void setNumeroDeCliente(String numeroDeCliente) {
        this.numeroDeCliente = numeroDeCliente;
    }


    public void agregarCuentaBancariaPorNumeroDeCuenta(CuentaBancaria cuentaBancaria){
     if (cuentasBancariasPorNumeroDeCuenta.containsKey(cuentaBancaria.getNumeroDeCuenta())== false){
         cuentasBancariasPorNumeroDeCuenta.put(cuentaBancaria.getNumeroDeCuenta(),cuentaBancaria);
     }
    }

    public void quitarCuentaBancariaPorNumeroDeCuenta(Long numeroDeCuenta){
        cuentasBancariasPorNumeroDeCuenta.remove(numeroDeCuenta);
    }


    public void agregarCuentaBancaria(CuentaBancaria cuentaBancaria){
    if(!cuentaBancarias.contains(cuentaBancaria)){
        cuentaBancarias.add(cuentaBancaria);
        }
    }

    public void quitarCuentaBancaria(CuentaBancaria cuentaBancaria){
        if(cuentaBancarias.contains(cuentaBancaria)){
            cuentaBancarias.remove(cuentaBancaria);
        }
    }

    public void quitarCuentaBancaria(Long numeroDeCuenta){
        CuentaBancaria cuentaBancariaEncontrada = null;
        for(CuentaBancaria cuenta : cuentaBancarias){
            if (cuenta.getNumeroDeCuenta().equals(numeroDeCuenta)){
                cuentaBancariaEncontrada = cuenta;
                break;
            }
        }
        if (cuentaBancariaEncontrada != null){
            cuentaBancarias.remove(cuentaBancariaEncontrada);
        }
    }

    public  void  listarCuentas(){
        System.out.println("Cuentas de Cliente " + numeroDeCliente);
        cuentaBancarias.sort(new Comparator<CuentaBancaria>() {
            @Override
            public int compare(CuentaBancaria o1, CuentaBancaria o2) {
                return o1.getNumeroDeCuenta().compareTo(o2.getNumeroDeCuenta());
            }
        });

        for (CuentaBancaria cuenta: cuentaBancarias){
            System.out.println(cuenta);
        }
    }
}
