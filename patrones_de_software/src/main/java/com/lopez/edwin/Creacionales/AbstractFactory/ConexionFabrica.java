package com.lopez.edwin.Creacionales.AbstractFactory;

import com.lopez.edwin.Creacionales.AbstractFactory.Api.IApiREST;
import com.lopez.edwin.Creacionales.AbstractFactory.DB.IConexion;
import com.lopez.edwin.Creacionales.AbstractFactory.DB.Mysql;
import com.lopez.edwin.Creacionales.AbstractFactory.DB.PostgreSql;

public class ConexionFabrica implements IFabricaAbstracta {

    @Override
    public IConexion getDB(String motor) {
        switch (motor) {
            case "MYSQL":
                return new Mysql();

            case "POSTGRESQL":
                return new PostgreSql();
            default:
                return null;
        }
    }

    @Override
    public IApiREST getREST(String metodo) {
        // TODO Auto-generated method stub
        return null;
    }

}
