package com.lopez.edwin.Creacionales.Builder;

public class ComputadoraBuilder implements IComputadora {

    private String cpu;
    private String ram;
    private String gpu;

    @Override
    public Computadora construir() {
        return new Computadora(cpu, ram, gpu);
    }

    @Override
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    @Override
    public void setRam(String ram) {
        this.ram = ram;
    }

}
