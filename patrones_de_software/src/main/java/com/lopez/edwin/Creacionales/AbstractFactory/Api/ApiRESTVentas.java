package com.lopez.edwin.Creacionales.AbstractFactory.Api;

public class ApiRESTVentas implements IApiREST {

    @Override
    public void delete() {
        System.out.println("Eliminando ventas...");

    }

    @Override
    public void get() {
        System.out.println("Obteniendo ventas...");

    }

    @Override
    public void post() {
        System.out.println("Creando ventas...");

    }

    @Override
    public void put() {
        System.out.println("Actualizando ventas...");
    }

}
