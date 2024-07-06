package com.lopez.edwin.Estructurales.Facade;

public class Main {
    public static void main(String[] args) {
        Fachada cliente = new Fachada();
        cliente.buscar("12/10/2022", "Quito", "Ambato");
    }
}
