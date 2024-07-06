package com.patrones.creacionales.TallerBuilder;

public class Usuario {
    private String metodo;
    private String token;
    private String email;
    private String telefono;
    private String direccion;

    private Usuario(String email, String telefono, String direccion) {
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public static Usuario crearUsuario(String email, String telefono, String direccion) {
        return new Usuario(email, telefono, direccion);
    }

    public Usuario build() {
        return this;
    }

    public static class InnerUsuario {
        private Usuario usuario;

        public Usuario build() {
            return usuario;
        }

        public InnerUsuario(Usuario usuario) {
            this.usuario = usuario;
        }

        // public String getMetodo() {
        // return metodo;
        // }

        public InnerUsuario setMetodo(String metodo) {
            usuario.metodo = metodo;
            return this;
        }

        // public String getToken() {
        // return token;
        // }

        public InnerUsuario setToken(String token) {
            usuario.token = token;
            return this;
        }

    }

    public String getEmail() {
        return email;
    }

    public Usuario setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getTelefono() {
        return telefono;
    }

    public Usuario setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public String getDireccion() {
        return direccion;
    }

    public Usuario setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public InnerUsuario verificarPagosHabilitados() {
        if (this.email.isEmpty() || this.telefono.isEmpty() || this.direccion.isEmpty()) {
            throw new IllegalStateException("Falta información para habilitar métodos de pago");
        }
        return new InnerUsuario(this);
    }

}
