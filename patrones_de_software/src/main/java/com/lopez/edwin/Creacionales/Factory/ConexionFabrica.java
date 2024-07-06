package com.lopez.edwin.Creacionales.Factory;

public class ConexionFabrica {
    public IConexion getConexion(String motor) {
        switch (motor) {
            case "MYSQL":
                return new Mysql();

            case "POSTGRESQL":
                return new PostgreSql();
            default:
                return null;
        }
    }
}
