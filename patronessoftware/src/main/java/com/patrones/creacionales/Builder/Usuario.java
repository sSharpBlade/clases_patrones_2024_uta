package com.patrones.creacionales.Builder;

public class Usuario {

    // ! Requeridos para crear un usuario
    private String usuario;
    private String clave;
    // ? Opcional
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String direccion;
    /*
     * Si el medio de contacto tiene un valor verdadero el cliente podrá asignar
     * valores para email, teléfono y dirección si el medio de contacto es falso no
     * se habilitaran los setters de los atributos
     */
    private Boolean medioContacto;

    private Usuario(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
        this.medioContacto = false;
    }

    public static Usuario crearUsuario(String username, String clave) {
        return new Usuario(username, clave);
    }

    // * Este método es un método de instancia */
    public Usuario build() {
        return this;
    }

    @Override
    public String toString() {
        return "Usuario [usuario=" + usuario + ", clave=" + clave + ", nombre=" + nombre + ", apellido=" + apellido
                + ", email=" + email + ", telefono=" + telefono + ", direccion=" + direccion + "]";
    }

    public static class BuilderUsuario {
        private Usuario usuario;

        public BuilderUsuario(Usuario usuario) {
            this.usuario = usuario;

            // public String getEmail() {
            // return email;
        }

        public BuilderUsuario setEmail(String email) {
            usuario.email = email;
            return this;
        }

        // public String getTelefono() {
        // return telefono;

        public BuilderUsuario setTelefono(String telefono) {
            usuario.telefono = telefono;
            return this;
        }

        // public String getDireccion() {
        // return direccion;
        // }

        public BuilderUsuario setDireccion(String direccion) {
            usuario.direccion = direccion;
            return this;
        }

        // public String getNombre() {
        // return nombre;
        // }

        public BuilderUsuario setNombre(String nombre) {
            usuario.nombre = nombre;
            return this;
        }

        // public String getApellido() {
        // return apellido;
        // }

        public BuilderUsuario setApellido(String apellido) {
            usuario.apellido = apellido;
            return this;
        }

        public Usuario build() {
            return usuario;
        }

    }

    public String getUsuario() {
        return usuario;
    }

    public Usuario setUsuario(String usuario) {
        this.usuario = usuario;
        return this;
    }

    public String getClave() {
        return clave;
    }

    public Usuario setClave(String clave) {
        this.clave = clave;
        return this;
    }

    public Boolean getMedioContacto() {
        return medioContacto;
    }

    public BuilderUsuario setMedioContacto(Boolean medioContacto) {
        if (!medioContacto) {
            throw new IllegalStateException("No es posible asignar un valor falso a mi medio de contacto");
        }
        this.medioContacto = medioContacto;
        return new BuilderUsuario(this);
    }

}
