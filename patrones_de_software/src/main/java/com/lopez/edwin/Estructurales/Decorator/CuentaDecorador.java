package com.lopez.edwin.Estructurales.Decorator;

public abstract class CuentaDecorador implements ICuenta {
    protected ICuenta cuenta;

    public CuentaDecorador(ICuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void abrirCuenta(Cuenta c) {
        this.cuenta.abrirCuenta(c);
    }

}
