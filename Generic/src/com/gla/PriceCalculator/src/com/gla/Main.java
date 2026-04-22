package com.gla.PriceCalculator.src.com.gla;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        // List of Mobiles
        List<Mobile> mobiles = Arrays.asList(
                new Mobile(15000),
                new Mobile(20000),
                new Mobile(18000)
        );

        // List of Laptops
        List<Laptop> laptops = Arrays.asList(
                new Laptop(50000),
                new Laptop(70000)
        );

        double mobileTotal = PriceCalculator.calculateTotal(mobiles);
        double laptopTotal = PriceCalculator.calculateTotal(laptops);

        System.out.println("Total Mobile Price: " + mobileTotal);
        System.out.println("Total Laptop Price: " + laptopTotal);
    }
}
