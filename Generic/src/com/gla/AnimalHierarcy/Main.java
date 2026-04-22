package com.gla.AnimalHierarcy;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Dog> dogs = Arrays.asList(new Dog(), new Dog());
        List<Cat> cats = Arrays.asList(new Cat(), new Cat());

        System.out.println("Dogs:");
        AnimalUtil.printAnimals(dogs);

        System.out.println("\nCats:");
        AnimalUtil.printAnimals(cats);
    }
}
