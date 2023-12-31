package org.example.cuentas;

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
}
