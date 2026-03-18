package com.gla;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Phone Number:");
        String phoneNumber = sc.nextLine();

        System.out.println("Enter name:");
        String name = sc.nextLine();

        System.out.println("Enter Company name:");
        String companyName = sc.nextLine();

        Contact c = new Contact(name,phoneNumber);
        BusinessContact b = new BusinessContact(name,phoneNumber,companyName);

        System.out.println("cContact searched:");
        c.display();
        System.out.println("Business Contact searched:");
        b.display();
    }
}
