package com.gla;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter order Id:");
        int orderId = sc.nextInt();
        System.out.println("Enter base Amount:");
        double baseAmount = sc.nextDouble();
        Order Regular = new RegularOrder(orderId,baseAmount);
        Order Premium = new PremiumOrder(orderId,baseAmount);
        System.out.println("Regular Order:" +Regular.calculateBill());
        System.out.println("Premium Order: "+Premium.calculateBill());
    }
}
