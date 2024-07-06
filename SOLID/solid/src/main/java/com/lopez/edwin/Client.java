package com.lopez.edwin;

public class Client {
    public String print(Rectangle rectangle) {
        System.out.println("ESTE ES MI RECTANGULO : " + rectangle);
        return "ESTE ES MI RECTANGULO : " + rectangle;
    }

    public String print(Triangle triangle) {
        System.out.println("ESTE ES MI TRIANGULO : " + triangle);
        return "ESTE ES MI TRIANGULO : " + triangle;
    }

    public double calculateArea(Rectangle rectangle) {
        return rectangle.areaCalculate();
    }

    public double calculateArea(Triangle triangle) {
        return triangle.areaCalculate();
    }

    // * Abierto - Cerrado
    public double areaCalculate(IGeometricShape geometricShape) {
        return geometricShape.areaCalculate();
    }

}
