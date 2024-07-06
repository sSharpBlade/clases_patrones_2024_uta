package com.patrones.estructurales.Composite;

import java.util.ArrayList;
import java.util.List;

public class Menu implements IMenu {

    private List<IMenu> menuList;

    public Menu() {
        this.menuList = new ArrayList<IMenu>();
    }

    @Override
    public boolean abrir() {
        System.out.println("Abierto");
        return false;
    }

    @Override
    public boolean cerrar() {
        System.out.println("Cerrado");
        return false;
    }

    public void agregarMenu(IMenu menu) {
        this.menuList.add(menu);
    }

    public IMenu obtenerMenu(int index) {
        return this.menuList.get(index);
    }

    @Override
    public String toString() {
        System.out.println("Menu [menuList=" + menuList + "]");
        return "Menu [menuList=" + menuList + "]";
    }

}
