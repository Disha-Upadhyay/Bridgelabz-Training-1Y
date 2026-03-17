package com.gla;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product Id:");
        int productId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Product Name:");
        String productName = sc.nextLine();

        System.out.println("Enter Brand Name:");
        String brandName = sc.nextLine();

        System.out.println("Enter Keyword:");
        String keyword = sc.next();

        Product p = new Product(productId,productName);
        ElectronicProduct e = new ElectronicProduct(productId,productName,brandName);

        System.out.println("Product Match :"+p.isMatch(keyword));
        System.out.println("Electronic Product Match :"+e.isMatch(keyword));

    }
}
