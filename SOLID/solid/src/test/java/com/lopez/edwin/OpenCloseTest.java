package com.lopez.edwin;

import org.junit.Test;

public class OpenCloseTest {

    @Test
    public void should() {
        IGeometricShape rectangle = new Rectangle(10, 20);
        IGeometricShape triangle = new Triangle(5, 10);
        Client client = new Client();

        // client.print(rectangle);
        // client.print(triangle);

        double areaRectangle = client.areaCalculate(rectangle);
        double areaTriangle = client.areaCalculate(triangle);

        System.out.println("AREA RECTANGULO: " + areaRectangle);
        System.out.println("AREA TRIANGULO: " + areaTriangle);

    }

}
