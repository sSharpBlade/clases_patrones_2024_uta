package com.patrones.creacionales.SimpleFactory;

public class Pizza {
    private int cantidadRebanadas;

    public Pizza(int cantidadRebanadas) {
        this.cantidadRebanadas = cantidadRebanadas;
    }

    @Override
    public String toString() {
        return "Pizza [cantidadRebanadas=" + cantidadRebanadas + "]";
    }

}
