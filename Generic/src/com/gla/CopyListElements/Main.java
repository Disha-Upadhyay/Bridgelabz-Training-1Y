package com.gla.CopyListElements;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        List<Integer> source = Arrays.asList(10, 20, 30);

        List<Number> destination = new ArrayList<>();

        Copy.copyList(destination, source);

        System.out.println(destination);
    }
}
