package com.lopez.edwin;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    private float base = 5;
    private float height = 4;
    private Rectangle rectangle = new Rectangle(base, height);

    @Test
    public void shouldReturnARectangleInstance() {
        assertTrue(rectangle != null);
    }

    @Test
    public void shouldReturnValidArea() {
        assertTrue(rectangle.areaCalculate() == 20);
    }

    @Test
    public void shouldPrintAEmptyText() {
        rectangle.print();
        assertNotNull(rectangle);
    }

    @Test
    public void shouldPrintTextWhitClient() {
        System.out.println("CON CLIENTE");
        Client client = new Client();
        client.print(rectangle);
        rectangle.printWhitName();
        assertTrue("ESTE ES MI RECTANGULO : Rectangle [base=5.0, height=4.0]".equals(client.print(rectangle)));
    }

}
