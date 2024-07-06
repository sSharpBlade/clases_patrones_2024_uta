package com.lopez.edwin;

public class Triangle implements IGeometricShape {
    private float base;
    private float height;

    public Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public double areaCalculate() {
        return (this.base * this.height) / 2;
    }

    public void print() {
        System.out.println(this);
    }

    public void printWhitName() {
        System.out.println(this + " Edwin López");
    }

    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + "]";
    }
}
