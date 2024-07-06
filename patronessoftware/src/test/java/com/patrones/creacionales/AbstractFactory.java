package com.patrones;

import org.junit.Test;

import com.patrones.AbstractFactory.AppleStoreFactory;
import com.patrones.AbstractFactory.DellStoreFactory;
import com.patrones.AbstractFactory.IComputadora;
import com.patrones.AbstractFactory.ITablet;

public class AbstractFactory {
    @Test
    public void test1() {
        AppleStoreFactory appleStoreFactory = new AppleStoreFactory();
        DellStoreFactory dellStoreFactory = new DellStoreFactory();

        IComputadora macbook = appleStoreFactory.crearComputadora();
        ITablet ipad = appleStoreFactory.crearTablet();

        IComputadora dellxp = dellStoreFactory.crearComputadora();
        ITablet dellvue = dellStoreFactory.crearTablet();

        System.out.println(macbook);
        System.out.println(ipad);
        System.out.println(dellxp);
        System.out.println(dellvue);
    }
}
