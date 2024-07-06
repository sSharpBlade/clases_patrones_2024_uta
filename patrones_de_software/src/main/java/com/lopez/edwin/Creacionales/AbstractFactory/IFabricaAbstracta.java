package com.lopez.edwin.Creacionales.AbstractFactory;

import com.lopez.edwin.Creacionales.AbstractFactory.Api.IApiREST;
import com.lopez.edwin.Creacionales.AbstractFactory.DB.IConexion;

public interface IFabricaAbstracta {
    IConexion getDB(String motor);

    IApiREST getREST(String metodo);
}
