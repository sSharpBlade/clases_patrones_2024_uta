package com.lopez.edwin.Estructurales.Facade;

public class HotelAPI {
    public void buscarHotel(String fecha, String origen, String destino) {
        System.out.println("Desde " + origen + " se solicita un hotel para " + destino + " en la fecha " + fecha);
    }
}
