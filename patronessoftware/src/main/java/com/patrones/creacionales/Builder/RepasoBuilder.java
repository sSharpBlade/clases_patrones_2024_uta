package com.patrones.creacionales.Builder;

public class RepasoBuilder {
    private String username;
    private String password;

    private String name;
    private String dni;

    private RepasoBuilder(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static RepasoBuilder builder(String username, String password) {
        return new RepasoBuilder(username, password);
    }

    public RepasoBuilder build() {
        return this;
    }

    public Login start() {
        if (this.username == null || this.password == null) {
            throw new IllegalStateException("Se encuentran vacías las credenciales");
        }
        return new Login(this);
    }

    @Override
    public String toString() {
        return "RepasoBuilder [username=" + username + ", password=" + password + ", name=" + name + ", dni=" + dni
                + "]";
    }

    public static class Login {
        private RepasoBuilder repasoBuilder;

        public Login(RepasoBuilder repasoBuilder) {
            this.repasoBuilder = repasoBuilder;
        }

        public Login setName(String name) {
            repasoBuilder.name = name;
            return this;
        }

        public Login setDni(String dni) {
            repasoBuilder.dni = dni;
            return this;
        }

        public RepasoBuilder build() {
            return repasoBuilder;
        }

    }

}
