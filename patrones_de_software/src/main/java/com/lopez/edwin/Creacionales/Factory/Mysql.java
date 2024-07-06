package com.lopez.edwin.Creacionales.Factory;

public class Mysql implements IConexion {

    @Override
    public void conectar() {
        System.out.println("Conectando Mysql...");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando Mysql...");
    }

}
