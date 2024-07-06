package com.lopez.edwin.liskovclase;

public class Adult extends Person {
    private String dni;
    private String creditCard;

    public void pay() {
        System.out.println("La persona con dni " + dni + " realizo el pago con la tarjeta " + creditCard);
    }

    public Adult(String name, String lastName, String address, String dni, String creditCard) {
        super(name, lastName, address);
        this.dni = dni;
        this.creditCard = creditCard;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    
}
