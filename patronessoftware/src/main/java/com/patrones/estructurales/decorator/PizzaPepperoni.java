package com.patrones.estructurales.decorator;

public class PizzaPepperoni implements IPizza {

    @Override
    public String descripcion() {

        return "Pizza pepperoni";
    }

    @Override
    public Double precio() {
        return 8.00;
    }

}
