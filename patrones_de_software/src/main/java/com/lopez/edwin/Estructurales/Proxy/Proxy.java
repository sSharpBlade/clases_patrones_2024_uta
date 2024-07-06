package com.lopez.edwin.Estructurales.Proxy;

public class Proxy implements ICuenta {
    // private CuentaImplementacion cuenta;

    // ! para cambiar la implementación //
    private ICuenta cuenta;

    public Proxy(ICuenta cuenta) {
        this.cuenta = cuenta;
    }

    // ! ------------------------------ //

    @Override
    public Cuenta depositarDinero(Cuenta cuenta, double monto) {
        if (this.cuenta == null) {
            this.cuenta = new CuentaImplementacion_B();
        }
        return this.cuenta.depositarDinero(cuenta, monto);
    }

    @Override
    public void mostrarSaldo(Cuenta cuenta) {
        if (this.cuenta == null) {
            this.cuenta = new CuentaImplementacion_B();
        }
        this.cuenta.mostrarSaldo(cuenta);
    }

    @Override
    public Cuenta retirarDinero(Cuenta cuenta, double monto) {
        if (this.cuenta == null) {
            this.cuenta = new CuentaImplementacion_B();
        }
        return this.cuenta.retirarDinero(cuenta, monto);
    }

}
