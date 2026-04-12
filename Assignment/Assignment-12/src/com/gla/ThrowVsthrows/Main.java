package com.gla.ThrowVsthrows;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        try{
            System.out.println("Enter amount:");
            double amount=sc.nextDouble();
            System.out.println("Enter rate:");
            double rate= sc.nextDouble();
            System.out.println("enter years:");
            int years= sc.nextInt();

            Interest i1=new Interest();
            double result=i1.calculateInterest(amount,rate,years);
            System.out.println("Calculated interest:"+result);
        } catch(IllegalArgumentException e){
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
}
