package com.patrones;

import org.junit.Test;

import com.patrones.creacionales.TallerBuilder.Usuario;

public class Taller {
    @Test
    public void test() {
        Usuario user = Usuario.crearUsuario("null", "null", "null").verificarPagosHabilitados().build();

    }
}
