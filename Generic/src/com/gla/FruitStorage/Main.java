package com.gla.FruitStorage;

public class Main {
    public static void main(String[] args) {

        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.addFruit(new Apple("Red Apple"));
        appleBox.addFruit(new Apple("Green Apple"));

        System.out.println("Apple Box:");
        appleBox.displayFruits();

        FruitBox<Mango> mangoBox = new FruitBox<>();
        mangoBox.addFruit(new Mango("Alphonso Mango"));

        System.out.println("\nMango Box:");
        mangoBox.displayFruits();
    }
}
