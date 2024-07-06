package com.patrones.creacionales.AbstractFactory;

public class XPLaptop implements IComputadora {

    private String procesador;
    private String ram;

    public XPLaptop(String procesador, String ram) {
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
        return "XPLaptop [procesador=" + procesador + ", ram=" + ram + "]";
    }

}
