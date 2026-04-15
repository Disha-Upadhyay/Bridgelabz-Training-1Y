package com.gla.GenericCart;

public class Main {
    public static void main(String[] args) {

        // Cart for Electronics
        Cart<Electronics> eCart = new Cart<>();
        eCart.addItem(new Electronics("Mobile"));
        eCart.addItem(new Electronics("Laptop"));

        System.out.println("Electronics Cart:");
        eCart.displayItems();

        // Cart for Clothing
        Cart<Clothing> cCart = new Cart<>();
        cCart.addItem(new Clothing("T-Shirt"));
        cCart.addItem(new Clothing("Jeans"));

        System.out.println("\nClothing Cart:");
        cCart.displayItems();
    }

}
