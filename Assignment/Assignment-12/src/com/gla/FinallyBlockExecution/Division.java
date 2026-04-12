package com.gla.FinallyBlockExecution;
import java.util.Scanner;
public class Division {
    public static void  main(String[] args){
    Scanner sc =new Scanner(System.in);

    try{
        System.out.println("Enter first value:");
        int a= sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();

        int division=a/b;
        System.out.println("Result"+division);

    }
    catch(ArithmeticException e){
        System.out.println("cannot divided by zero.");
    }
    finally {
        System.out.println("Operation completed");
    }
}
}
