package com.lopez.edwin.SegregacionInterfaces;

public class Motorcycle implements IVehicle {

    @Override
    public void off() {
        System.out.println("Moto apagada");

    }

    @Override
    public void on() {
        System.out.println("Moto encendida");

    }

    @Override
    public void refill() {
        System.out.println("Moto recargando combustible");

    }

    @Override
    public void start() {
        System.out.println("Moto en movimiento");

    }

    @Override
    public void stop() {
        System.out.println("Moto detenida");

    }

}
