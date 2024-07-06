package com.patrones.creacionales.AbstractFactory;

public class DellStoreFactory implements IAbstractFactory {

    @Override
    public IComputadora crearComputadora() {
        return new XPLaptop("I5", "16GB");
    }

    @Override
    public ITablet crearTablet() {
        return new XTablet("1TB", "2023");
    }

}
