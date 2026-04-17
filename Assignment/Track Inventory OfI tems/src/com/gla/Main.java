package com.gla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter item code:");
        int itemCode = sc.nextInt();
        System.out.println("Enter itemName:");
        String itemName = sc.next();
        System.out.println("Enter price:");
        double price = sc.nextDouble();
        System.out.println("Enter quantity:");
        int quantity= sc.nextInt();
        Item a1 = new Item(itemCode,itemName,price);
        a1.calculate(quantity);
    }
}
