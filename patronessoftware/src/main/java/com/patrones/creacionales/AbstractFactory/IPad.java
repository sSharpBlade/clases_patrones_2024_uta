package com.patrones.creacionales.AbstractFactory;

public class IPad implements ITablet {
    private String almacenamiento;
    private String anio;

    public IPad(String almacenamiento, String anio) {
        this.almacenamiento = almacenamiento;
        this.anio = anio;
    }

    @Override
    public String getAlmacenamiento() {
        return this.almacenamiento;
    }

    @Override
    public String getAnio() {
        return this.anio;
    }

    @Override
    public String toString() {
        return "IPad [almacenamiento=" + almacenamiento + ", anio=" + anio + "]";
    }

}
