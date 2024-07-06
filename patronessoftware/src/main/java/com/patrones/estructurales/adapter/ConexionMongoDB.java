package com.patrones.estructurales.adapter;

public class ConexionMongoDB implements IConexionNoSQL {

    @Override
    public void conexion() {
        System.out.println("Conectando a mongo db ...");
    }

    @Override
    public String ejecutarConsulta() {
        return "Ejecutando consulta en mongo db ...";
    }

}
