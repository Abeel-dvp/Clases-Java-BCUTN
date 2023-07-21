package org.example.cuentas;

import java.util.Objects;

public class CajaDeAhorro extends CuentaBancaria {
    @Override
    public void extraer(Double monto) {
        Double nuevoSaldo = super.getSaldoActual() - monto;
        if(nuevoSaldo >=0){
           super.setSaldoActual(nuevoSaldo);
        } else {
            System.out.println("No tenes saldo suficiente");
        }


    }

    @Override
    public String toString() {
        return "CajaDeAhorro{" +
                "numeroDeCuenta=" + super.getNumeroDeCuenta()+
                ", saldoActual=" + super.getSaldoActual() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuentaBancaria that = (CuentaBancaria) o;
        return Objects.equals(super.getNumeroDeCuenta(), that.getNumeroDeCuenta()) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getNumeroDeCuenta());
    }

}
