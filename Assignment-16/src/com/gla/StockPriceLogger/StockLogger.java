package com.gla.StockPriceLogger;
import java.util.Arrays;
import java.util.List;
public class StockLogger {
    public static void main(String[] args) {
        List<Double> stockPrices = Arrays.asList(101.5, 102.3, 99.8, 105.2, 100.0);

        stockPrices.forEach(price -> System.out.println("Stock Price: " + price));
    }
}
