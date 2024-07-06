package com.patrones;

import org.junit.Test;

import com.patrones.creacionales.FactoryMethod.Pastel;
import com.patrones.creacionales.FactoryMethod.PasteleriaEL;

public class FactoryMethodTest {
    @Test
    public void test1() {
        PasteleriaEL pas = new PasteleriaEL();

        Pastel pastelChocolate = pas.prepararPastel("Chocolate");
        System.out.println(pastelChocolate);

        Pastel pastelVainilla = pas.prepararPastel("Vainilla");
        System.out.println(pastelVainilla);

        Pastel pastelLimon = pas.prepararPastel("Limon");
        System.out.println(pastelLimon);

        PasteleriaEL pas1 = new PasteleriaEL();
        Pastel pastelRelleno = pas1.prepararPastel("Rellena");
        System.out.println(pastelRelleno);
    }
}
