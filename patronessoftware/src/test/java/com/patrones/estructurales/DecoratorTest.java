package com.patrones.estructurales;

import org.junit.Test;

import com.patrones.estructurales.decorator.BordeQueso;
import com.patrones.estructurales.decorator.IPizza;
import com.patrones.estructurales.decorator.PimientoExtra;
import com.patrones.estructurales.decorator.PizzaHawaiana;
import com.patrones.estructurales.decorator.PizzaPepperoni;
import com.patrones.estructurales.decorator.QuesoExtra;

public class DecoratorTest {
    @Test
    public void test() {
        IPizza pizzaHawaiana = new QuesoExtra(new PizzaHawaiana());
        IPizza pizzaPepperoni = new BordeQueso(new PizzaPepperoni());

        System.out.println(pizzaHawaiana.descripcion());
        System.out.println(pizzaHawaiana.precio());

        System.out.println(pizzaPepperoni.descripcion());
        System.out.println(pizzaPepperoni.precio());
    }

    @Test
    public void combinado() {
        IPizza pizzaPepperoni = new QuesoExtra(new BordeQueso(new PimientoExtra(new PizzaPepperoni())));
        System.out.println(pizzaPepperoni.descripcion());
        System.out.println(pizzaPepperoni.precio());
    }
}
