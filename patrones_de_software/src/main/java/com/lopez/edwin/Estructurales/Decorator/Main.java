package com.lopez.edwin.Estructurales.Decorator;

public class Main {
    public static void main(String[] args) {
        Cuenta c = new Cuenta();
        c.setId(5);
        c.setCliente("Edwin");

        ICuenta cuenta = new CuentaAhorro();
        ICuenta blindar = new CuentaBlindaje(cuenta);

        blindar.abrirCuenta(c);
    }
}
