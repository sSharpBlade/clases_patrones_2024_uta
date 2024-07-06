package com.lopez.edwin.Creacionales.Builder;

public interface IComputadora {
    public void setCpu(String cpu);

    public void setRam(String ram);

    public void setGpu(String gpu);

    public Computadora construir();
}
