package com.lopez.edwin.Estructurales.Adapter;

public class Main {
    public static void main(String[] args) {
        ILampara lampara = new LamparaEspañola();
        lampara.pulsar();

        ILampara lampara2 = new Adaptador();
        lampara2.pulsar();
    }
}
