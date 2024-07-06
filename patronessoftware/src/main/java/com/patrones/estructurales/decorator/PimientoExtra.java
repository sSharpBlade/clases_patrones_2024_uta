package com.patrones.estructurales.decorator;

public class PimientoExtra implements IPizza {

    private IPizza pizza;

    public PimientoExtra(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String descripcion() {
        return this.pizza.descripcion() + " con pimiento extra";
    }

    @Override
    public Double precio() {
        return this.pizza.precio() + 1.00;
    }

}
