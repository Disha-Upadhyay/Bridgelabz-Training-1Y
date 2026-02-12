package com.gla.string.JavaStringPracticeProblems;

import java.util.Scanner;
public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char remove = sc.next().charAt(0);
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != remove) result += ch;
        }
        System.out.println("Modified String: \"" + result + "\"");
    }
}