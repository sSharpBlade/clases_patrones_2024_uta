package com.patrones.estructurales;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.patrones.estructurales.Composite.Menu;
import com.patrones.estructurales.TallerComposite.Box;
import com.patrones.estructurales.TallerComposite.Product;

public class CompositeTest {
    @Test
    public void test1() {
        Menu menu = new Menu();

        Menu menu1 = new Menu();
        Menu menu2 = new Menu();

        menu.agregarMenu(menu1);
        menu.agregarMenu(menu2);

        Menu menu3 = new Menu();

        Menu menu4 = new Menu();
        Menu menu5 = new Menu();

        menu3.agregarMenu(menu4);
        menu3.agregarMenu(menu5);

    }

    @Test
    public void TallerCompositeTest() {
        // Crear productos individuales
        Product product1 = new Product("Producto 1", 100.0);
        Product product2 = new Product("Producto 2", 150.0);

        // Crear una caja pequeña y añadir productos
        Box smallBox = new Box(10.0); // Coste de empaquetado de la caja pequeña
        smallBox.addComponent(product1);
        smallBox.addComponent(product2);

        // Crear un producto adicional y una caja grande que contiene el producto
        // adicional y la caja pequeña
        Product product3 = new Product("Producto 3", 200.0);
        Box bigBox = new Box(20.0); // Coste de empaquetado de la caja grande
        bigBox.addComponent(product3);
        bigBox.addComponent(smallBox);

        // Calcular el precio total del pedido
        double totalPrice = bigBox.calculatePrice();

        // Verificar que el precio total sea el esperado
        double expectedPrice = 100.0 + 150.0 + 10.0 + 200.0 + 20.0;
        assertEquals(expectedPrice, totalPrice, 0.0);
    }
}
