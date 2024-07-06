package com.patrones.creacionales.SimpleFactory;

public class Pizzeria {
    public Pizza crearPizzaPequena() {
        return new Pizza(6); // * Asumimos que son para pequeñas seis rebanadas */

    }

    public Pizza crearPizzaMediana() {
        return new Pizza(8); // * Asumimos que son para medianas ocho rebanadas */

    }

    public Pizza crearPizzaGrande() {
        return new Pizza(12); // * Asumimos que son para grande doce rebanadas */

    }
}
