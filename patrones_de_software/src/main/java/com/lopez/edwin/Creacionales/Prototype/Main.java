package com.lopez.edwin.Creacionales.Prototype;

public class Main {
    public static void main(String[] args) {
        Cuenta c = new Cuenta();
        c.setTitular("EDWIN");
        c.setNumero("01818");
        c.setSaldo(15);

        Cuenta clonada = c.clone();

        if (clonada != null) {
            System.out.println(clonada.toString());
        }

        System.out.println(c == clonada);
    }
}
