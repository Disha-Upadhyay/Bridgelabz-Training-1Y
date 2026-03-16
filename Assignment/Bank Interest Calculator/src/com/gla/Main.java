package com.gla;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Account Number:");
        int accountNumber=sc.nextInt();
        System.out.println("Enter balance:");
        double balance = sc.nextDouble();
        Account Saving = new SavingsAccount(accountNumber,balance);
        Account Current = new CurrentAccount(accountNumber,balance);
        System.out.println("Saving Account" +Saving.calculateInterest());
        System.out.println("Current Account" +Current.calculateInterest());
    }
}
