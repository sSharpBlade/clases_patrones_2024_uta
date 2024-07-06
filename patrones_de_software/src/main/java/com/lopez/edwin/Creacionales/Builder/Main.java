package com.lopez.edwin.Creacionales.Builder;

public class Main {
    public static void main(String[] args) {
        ComputadoraDirector director = new ComputadoraDirector();

        ComputadoraBuilder builder = new ComputadoraBuilder();

        director.Gamer(builder);

        Computadora pc = builder.construir();

        System.out.println(pc.toString());
    }
}
