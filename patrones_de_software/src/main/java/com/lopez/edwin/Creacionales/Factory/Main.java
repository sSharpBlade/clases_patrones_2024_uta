package com.lopez.edwin.Creacionales.Factory;

public class Main {
    public static void main(String[] args) {
        ConexionFabrica fabrica = new ConexionFabrica();
        IConexion cx1 = fabrica.getConexion("MYSQL");
        cx1.conectar();
        IConexion cx2 = fabrica.getConexion("POSTGRESQL");
        cx2.conectar();
        // * DESCONECTAR LAS BASES
        cx1.desconectar();
        cx2.desconectar();
    }
}
