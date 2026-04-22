package com.gla.PriceCalculator.src.com.gla;

import java.util.List;

public class PriceCalculator {
    public static double calculateTotal(List<? extends Product> items) {
        double total = 0;
        for (Product p : items) {
            total += p.getPrice();
        }
        return total;
    }
}
