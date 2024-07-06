package com.patrones;

import org.junit.Test;

import com.patrones.creacionales.Builder.Usuario;

public class BuilderTest {
    @Test
    // todo: pregunta de examen -> por que sucede la impresión del mismo objeto
    // todo: pregunta de examen -> que diferencia existe en utilizar .build()
    public void test1() {
        Usuario u = Usuario.crearUsuario("elopez", "i3Juc").setMedioContacto(true).setNombre("Edwin").build();
        System.out.println(u);
    }

    @Test
    public void test2() {
        Usuario u = Usuario.crearUsuario("elopez", "i3Juc").setMedioContacto(false).setNombre("Edwin").build();
        System.out.println(u);
    }
}
