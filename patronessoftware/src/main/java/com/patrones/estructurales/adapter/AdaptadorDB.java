package com.patrones.estructurales.adapter;

public class AdaptadorDB implements IConexionBD {

    // * Paso 1. Definir su comportamiento
    private IConexionNoSQL noSQL;

    // ! Enlazamos las do interfaces, asignamos un valor atributo mediante el
    // constructo

    public AdaptadorDB(IConexionNoSQL noSQL) {
        this.noSQL = noSQL;
    }

    // ! ya con el valor asignado podemos utilizarlo

    @Override
    public void conexion() {
        this.noSQL.conexion();
    }

    @Override
    public String ejecutarConsulta() {
        return this.noSQL.ejecutarConsulta();
    }

}
