package com.lopez.edwin.Estructurales.Proxy;

public class Main {
    public static void main(String[] args) {
        Cuenta c = new Cuenta(0, "Edwin", 100);

        ICuenta proxy = new Proxy(new CuentaImplementacion_A());
        proxy.mostrarSaldo(c);
        c = proxy.depositarDinero(c, 50);
        c = proxy.retirarDinero(c, 50);
        proxy.mostrarSaldo(c);

        ICuenta proxyB = new Proxy(new CuentaImplementacion_B());
        proxyB.mostrarSaldo(c);
        c = proxyB.depositarDinero(c, 50);
        c = proxy.retirarDinero(c, 50);
        proxyB.mostrarSaldo(c);

    }
}
