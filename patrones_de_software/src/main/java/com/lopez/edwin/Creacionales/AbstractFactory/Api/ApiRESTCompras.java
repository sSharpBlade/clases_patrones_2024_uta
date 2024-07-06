package com.lopez.edwin.Creacionales.AbstractFactory.Api;

public class ApiRESTCompras implements IApiREST {

    @Override
    public void delete() {
        System.out.println("Eliminando compras...");

    }

    @Override
    public void get() {
        System.out.println("Obteniendo compras...");

    }

    @Override
    public void post() {
        System.out.println("Creando compras...");

    }

    @Override
    public void put() {
        System.out.println("Actualizando compras...");
    }

}
