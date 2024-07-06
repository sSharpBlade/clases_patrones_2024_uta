package com.lopez.edwin.Creacionales.Prototype;

public class Cuenta {
    private String numero;
    private String titular;
    private float saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public Cuenta clone() {
        Cuenta c = new Cuenta();
        try {
            c.setTitular(this.getTitular());
            c.setSaldo(this.getSaldo());
            c.setNumero(this.getNumero());
            return c;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public String toString() {
        return "Titular " + this.titular + " Saldo " + this.saldo;
    }

}
