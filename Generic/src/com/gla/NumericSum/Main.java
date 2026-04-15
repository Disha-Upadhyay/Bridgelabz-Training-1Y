package com.gla.NumericSum;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3);
        List<Double> doubles = Arrays.asList(2.5, 3.5);

        System.out.println(Sum.sumNumbers(ints));
        System.out.println(Sum.sumNumbers(doubles));
    }

}
