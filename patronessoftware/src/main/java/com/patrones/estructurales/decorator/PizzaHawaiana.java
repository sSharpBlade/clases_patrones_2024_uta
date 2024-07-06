package com.patrones.estructurales.decorator;

public class PizzaHawaiana implements IPizza {

    @Override
    public String descripcion() {
        return "Pizza Hawaiana";
    }

    @Override
    public Double precio() {
        return 6.00;
    }

}
