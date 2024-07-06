package com.patrones.estructurales.decorator;

public class QuesoExtra implements IPizza {

    private IPizza pizza;

    public QuesoExtra(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String descripcion() {
        return this.pizza.descripcion() + " con queso extra";
    }

    @Override
    public Double precio() {
        return this.pizza.precio() + 2.00;
    }

}
