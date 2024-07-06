package com.patrones.creacionales.FactoryMethod;

public class Pastel {

    // * Define una interfaz

    private int cantidadRebanadas;
    private String sabor;

    public Pastel(int cantidadRebanadas, String sabor) {
        this.cantidadRebanadas = cantidadRebanadas;
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        return "cantidadRebanadas=" + cantidadRebanadas + ", sabor=" + sabor;
    }

}
