package com.lopez.edwin.LISKOV;

public class Jaguar extends Felino {
    @Override
    public void cazar() {
        System.out.println("El jaguar caza silenciosamente en la jungla.");
    }

    @Override
    public void rugir() {
        System.out.println("El jaguar ruge ferozmente.");
    }
}