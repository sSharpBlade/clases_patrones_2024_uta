package com.lopez.edwin.Creacionales.Singleton;

public class Main {
    public static void main(String[] args) {
        Conexion c = Conexion.getInstancia();
        c.conectar();
        c.desconectar();
    }
}
