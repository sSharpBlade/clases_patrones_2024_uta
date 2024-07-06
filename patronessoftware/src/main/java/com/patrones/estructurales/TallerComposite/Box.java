package com.patrones.estructurales.TallerComposite;

import java.util.ArrayList;
import java.util.List;

public class Box implements IOrderComponent {
    private List<IOrderComponent> components = new ArrayList<>();
    private double packagingCost;

    public Box(double packagingCost) {
        this.packagingCost = packagingCost;
    }

    public void addComponent(IOrderComponent component) {
        components.add(component);
    }

    @Override
    public double calculatePrice() {
        double total = packagingCost;
        for (IOrderComponent component : components) {
            total += component.calculatePrice();
        }
        return total;
    }
}
