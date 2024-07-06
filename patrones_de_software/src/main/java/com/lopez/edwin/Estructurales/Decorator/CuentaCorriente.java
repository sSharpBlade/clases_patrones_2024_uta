package com.lopez.edwin.Estructurales.Decorator;

public class CuentaCorriente implements ICuenta {

    @Override
    public void abrirCuenta(Cuenta c) {
        System.out.println("Se abrió una cuenta corriente al nombre de " + c.getCliente());
    }

}
