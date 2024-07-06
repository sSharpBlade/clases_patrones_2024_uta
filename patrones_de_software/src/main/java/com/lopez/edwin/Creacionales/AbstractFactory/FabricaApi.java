package com.lopez.edwin.Creacionales.AbstractFactory;

import com.lopez.edwin.Creacionales.AbstractFactory.Api.ApiRESTCompras;
import com.lopez.edwin.Creacionales.AbstractFactory.Api.ApiRESTVentas;
import com.lopez.edwin.Creacionales.AbstractFactory.Api.IApiREST;
import com.lopez.edwin.Creacionales.AbstractFactory.DB.IConexion;

public class FabricaApi implements IFabricaAbstracta {
    @Override
    public IApiREST getREST(String metodo) {
        switch (metodo) {
            case "VENTAS":
                return new ApiRESTVentas();

            case "COMPRAS":
                return new ApiRESTCompras();

            default:
                return null;
        }
    }

    @Override
    public IConexion getDB(String motor) {
        // TODO Auto-generated method stub
        return null;
    }

}
