package com.patrones.creacionales.AbstractFactory;

public class MacBookPro implements IComputadora {

    private String procesador;
    private String ram;

    public MacBookPro(String procesador, String ram) {
        this.procesador = procesador;
        this.ram = ram;
    }

    @Override
    public String getProcesador() {
        return this.procesador;
    }

    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String toString() {
        return "MacBookPro [procesador=" + procesador + ", ram=" + ram + "]";
    }

}
