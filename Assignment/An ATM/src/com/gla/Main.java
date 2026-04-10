package com.gla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account holder:");
        String accountHolder=sc.nextLine();
        System.out.println("Enter Account number:");
        int accountNumber=sc.nextInt();
        System.out.println("Enter balance:");
        double balance= sc.nextDouble();
        System.out.println("Enter deposit money:");
        int deposit= sc.nextInt();
        System.out.println("Enter withdraw money:");
        int withdraw=sc.nextInt();

        BankAccount b1 = new BankAccount(accountHolder,accountNumber,balance);
        b1.Depositing(deposit);
        b1.Withdrawing(withdraw);
        b1.display();
    }
}
