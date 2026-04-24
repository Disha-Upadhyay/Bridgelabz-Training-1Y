package com.gla.TransformingNameForDisplay;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class CustomerNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Riya", "aman", "Karan", "neha");

        List<String> result = names.stream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
