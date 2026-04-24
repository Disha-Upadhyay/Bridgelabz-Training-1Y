package com.gla.InvoiceObjectCreation;
import java.util.*;
import java.util.stream.*;
public class Invoice {
    String transactionId;

    public Invoice(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Invoice ID: " + transactionId;

    }
}
