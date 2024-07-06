package com.lopez.edwin.Creacionales.Builder;

public class Computadora {
    private String cpu;
    private String ram;
    private String gpu;

    public Computadora(String cpu, String ram, String gpu) {
        this.cpu = cpu;
        this.ram = ram;
        this.gpu = gpu;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getGpu() {
        return gpu;
    }

    @Override
    public String toString() {
        return "Computadora [cpu=" + cpu + ", ram=" + ram + ", gpu=" + gpu + "]";
    }

}
