package com.lopez.edwin.Creacionales.AbstractFactory;

import com.lopez.edwin.Creacionales.AbstractFactory.Api.IApiREST;
import com.lopez.edwin.Creacionales.AbstractFactory.DB.IConexion;

public class Main {
    public static void main(String[] args) {
        IFabricaAbstracta ft = new FabricaPrincipal().getTipo("DB");
        IConexion cx1 = ft.getDB("MYSQL");
        cx1.conectar();

        IFabricaAbstracta ft1 = new FabricaPrincipal().getTipo("REST");
        IApiREST api = ft1.getREST("VENTAS");
        api.get();
    }
}
