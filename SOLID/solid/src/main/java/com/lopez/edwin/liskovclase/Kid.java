package com.lopez.edwin.liskovclase;

public class Kid extends Person {

    private Adult adult;

    public Kid(String name, String lastName, String address, Adult adult) {
        super(name, lastName, address);
        this.adult = adult;
    }

    public Adult getAdult() {
        return adult;
    }

    public void setAdult(Adult adult) {
        this.adult = adult;
    }

}
