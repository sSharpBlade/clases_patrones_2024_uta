package com.patrones.creacionales.AbstractFactory;

public class AppleStoreFactory implements IAbstractFactory {

    @Override
    public IComputadora crearComputadora() {
        return new MacBookPro("A15", "16GB");
    }

    @Override
    public ITablet crearTablet() {
        return new IPad("1Tb", "2024");
    }

}
