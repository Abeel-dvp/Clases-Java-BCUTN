package org.example.cuentas;

import java.util.Objects;

public class CuentaCorriente extends  CuentaBancaria {

    private Double limiteExtra = 1000.0;
    @Override
    public void extraer(Double monto) {
        Double nuevoSaldo = getSaldoActual() - monto;
    if (nuevoSaldo + limiteExtra >=0){
        setSaldoActual(nuevoSaldo);
    }   else {
        System.out.println("No posees saldo suficiente");
    }
    }

    public Double getLimiteExtra() {
        return limiteExtra;
    }

    public void setLimiteExtra(Double limiteExtra) {
        this.limiteExtra = limiteExtra;
    }


    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "numeroDeCuenta=" + super.getNumeroDeCuenta()+
                ", saldoActual=" + super.getSaldoActual() +
                ", limiteExtra= " + getLimiteExtra() +
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
