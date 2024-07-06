package com.patrones.estructurales.TallerComposite;

public class Product implements IOrderComponent {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double calculatePrice() {
        return price;
    }
}
