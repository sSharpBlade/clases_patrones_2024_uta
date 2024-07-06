package com.lopez.edwin.Estructurales.Decorator;

public class CuentaBlindaje extends CuentaDecorador {

    public CuentaBlindaje(ICuenta cuenta) {
        super(cuenta);
    }

    @Override
    public void abrirCuenta(Cuenta c) {
        cuenta.abrirCuenta(c);
        agregarSeguridad(c);
    }

    public void agregarSeguridad(Cuenta c) {
        System.out.println("Se agrega seguridad a la cuenta de " + c.getCliente());
    }
}
