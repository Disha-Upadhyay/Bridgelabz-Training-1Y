package com.gla.string.JavaStringPracticeProblems;

import java.util.Scanner;
public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String longest = "";
        String current = "";
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch != ' ') {
                current += ch;
            } else {
                if (current.length() > longest.length()) longest = current;
                current = "";
            }
        }
        if (current.length() > longest.length()) longest = current;
        System.out.println(longest);
    }
}