package com.lopez.edwin.Estructurales.Facade;

public class AvionAPI {
    public void buscarVuelos(String fecha, String origen, String destino) {
        System.out.println("Desde " + origen + " hacia " + destino + " en la fecha " + fecha);
    }
}
