package com.lopez.edwin.Estructurales.Facade;

public class Fachada {
    private AvionAPI aviones;
    private HotelAPI hoteles;

    public Fachada() {
        aviones = new AvionAPI();
        hoteles = new HotelAPI();
    }

    public void buscar(String fecha, String origen, String destino) {
        aviones.buscarVuelos(fecha, origen, destino);
        hoteles.buscarHotel(fecha, origen, destino);
    }
}
