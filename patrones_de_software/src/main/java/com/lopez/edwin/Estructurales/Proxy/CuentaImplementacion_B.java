package com.lopez.edwin.Estructurales.Proxy;

public class CuentaImplementacion_B implements ICuenta {

    @Override
    public Cuenta depositarDinero(Cuenta cuenta, double monto) {
        double saldo = cuenta.getSaldo() + monto;
        cuenta.setSaldo(saldo);
        this.mostrarSaldo(cuenta);
        return cuenta;
    }

    @Override
    public void mostrarSaldo(Cuenta cuenta) {
        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }

    @Override
    public Cuenta retirarDinero(Cuenta cuenta, double monto) {
        double saldo = cuenta.getSaldo() - monto + 0.2;
        cuenta.setSaldo(saldo);
        this.mostrarSaldo(cuenta);
        return cuenta;
    }

}
