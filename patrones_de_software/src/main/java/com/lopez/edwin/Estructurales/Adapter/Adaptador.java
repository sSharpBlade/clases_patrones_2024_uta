package com.lopez.edwin.Estructurales.Adapter;

public class Adaptador implements ILampara {
    LamparaInglesa ingles = new LamparaInglesa();

    @Override
    public void pulsar() {
        ingles.pulse();
    }
}
