package com.gla.BankTransactionSystem;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        try{
            System.out.println("Enter initial balance:");
            double balance= sc.nextDouble();

            BankAccount b1=new BankAccount(balance);

            System.out.println("Enter withdrawal amount:");
            double amount=sc.nextDouble();

            b1.withdraw(amount);

        }
        catch (InsufficientBalanceException e){
            System.out.println("Insufficient balance!");
        } catch(IllegalArgumentException e){
            System.out.println("Invalid amount!");
        }catch (Exception e){
            System.out.println("Invalid input type");
        }
    }
}
