package com.gla.AnimalHierarcy;

import java.util.List;

public class AnimalUtil {
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.sound();
        }
    }
}
