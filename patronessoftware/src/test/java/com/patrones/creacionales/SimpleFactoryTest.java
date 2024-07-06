package com.patrones;

import org.junit.Test;

import com.patrones.creacionales.SimpleFactory.Pizza;
import com.patrones.creacionales.SimpleFactory.Pizzeria;

public class SimpleFactoryTest {
    @Test
    public void test1() {
        Pizza p1 = new Pizza(8);
        System.out.println(p1);
    }

    @Test
    public void test2() {
        Pizzeria pz = new Pizzeria();
        Pizza pizzaHawaiana = pz.crearPizzaMediana();
        System.out.println(pizzaHawaiana);
    }
}
