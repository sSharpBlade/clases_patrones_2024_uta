package com.lopez.edwin.SegregacionInterfaces;

public class Car implements IVehicle {

    @Override
    public void off() {
        System.out.println("Carro apagado");

    }

    @Override
    public void on() {
        System.out.println("Carro encendido");

    }

    @Override
    public void refill() {
        System.out.println("Carro rellenando combustible");

    }

    @Override
    public void start() {
        System.out.println("Carro en movimiento");

    }

    @Override
    public void stop() {
        System.out.println("Carro detenido");

    }

}
