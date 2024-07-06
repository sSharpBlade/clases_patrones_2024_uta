package com.lopez.edwin.Estructurales.Adapter;

public class LamparaEspañola implements ILampara {
    private boolean encendida = false;

    @Override
    public void pulsar() {
        this.encendida = !encendida;
        this.encendida();
    }

    public void encendida() {
        if (encendida) {
            System.out.println("Esta encendida");
        } else {
            System.out.println("Esta apagada");
        }
    }
}
