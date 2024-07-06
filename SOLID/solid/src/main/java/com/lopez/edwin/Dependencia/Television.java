package com.lopez.edwin.Dependencia;

public class Television implements IElectronicDevices {

    @Override
    public void off() {
        System.out.println("Apagar");

    }

    @Override
    public void on() {
        System.out.println("Encender");

    }

}
