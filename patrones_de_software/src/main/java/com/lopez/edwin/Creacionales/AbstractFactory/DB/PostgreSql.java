package com.lopez.edwin.Creacionales.AbstractFactory.DB;

public class PostgreSql implements IConexion {

    @Override
    public void conectar() {
        System.out.println("Conectando PostgreSQL...");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando PostgreSQL...");
    }

}
