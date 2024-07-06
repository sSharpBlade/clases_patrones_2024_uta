package com.patrones.estructurales.adapter;

public class ConexionMySQL implements IConexionBD {

    @Override
    public void conexion() {
        System.out.println("Conexión a MySQL");

    }

    @Override
    public String ejecutarConsulta() {
        return "Consulta en MySQL";

    }

}
