package com.lopez.edwin.Creacionales.Singleton;

public class Conexion {
    private static Conexion instantcia;

    private Conexion() {
    }

    public static Conexion getInstancia() {
        if (instantcia == null) {
            instantcia = new Conexion();
        }
        return instantcia;
    }

    public void conectar() {
        System.out.println("Conectando...");
    }

    public void desconectar() {
        System.out.println("Desconectando...");
    }
}
