package com.lopez.edwin.Estructurales.Adapter;

public class LamparaInglesa {
    private boolean isON = false;

    public void pulse() {
        this.isON = !isON;
        this.isOn();
    }

    public void isOn() {
        if (isON) {
            System.out.println("Is ON");
        } else {
            System.out.println("Is OFF");
        }
    }
}
