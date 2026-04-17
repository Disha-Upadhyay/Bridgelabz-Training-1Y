package com.gla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();
        PalindromeChecker p1 = new PalindromeChecker(text);
        p1.display();
    }
}
