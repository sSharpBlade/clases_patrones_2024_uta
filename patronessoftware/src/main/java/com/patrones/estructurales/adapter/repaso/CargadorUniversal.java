package com.patrones.estructurales.adapter.repaso;

public class CargadorUniversal implements ICargadorEurpeo {
    private CargadorApple apple;

    public CargadorUniversal(CargadorApple apple) {
        this.apple = apple;
    }

    @Override
    public String cargar() {
        return this.apple.charge();
    }

}
