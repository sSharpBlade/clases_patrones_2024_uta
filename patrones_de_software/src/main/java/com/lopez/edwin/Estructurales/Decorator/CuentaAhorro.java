package com.lopez.edwin.Estructurales.Decorator;

public class CuentaAhorro implements ICuenta {

    @Override
    public void abrirCuenta(Cuenta c) {
        System.out.println("Se abrió una cuenta de ahorros al nombre de " + c.getCliente());
    }

}
