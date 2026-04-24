package com.gla.InvoiceObjectCreation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList("T101", "T102", "T103");

        List<Invoice> invoices = transactionIds.stream()
                .map(Invoice::new)
                .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}
