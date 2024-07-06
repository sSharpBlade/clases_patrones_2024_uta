package com.patrones.estructurales.decorator;

public class BordeQueso implements IPizza {

    private IPizza pizza;

    public BordeQueso(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String descripcion() {
        return this.pizza.descripcion() + " con bordes de queso";
    }

    @Override
    public Double precio() {
        return this.pizza.precio() + 4.00;
    }

}
