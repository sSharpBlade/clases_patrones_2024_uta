package com.lopez.edwin.Creacionales.AbstractFactory;

public class FabricaPrincipal {
    public IFabricaAbstracta getTipo(String tipo) {
        switch (tipo) {
            case "DB":
                return new ConexionFabrica();

            case "REST":
                return new FabricaApi();

            default:
                return null;
        }
    }
}
