package com.gla.string.JavaStringPracticeProblems;

import java.util.Scanner;
public class LexicographicalCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int minLength = s1.length() < s2.length() ? s1.length() : s2.length();
        int result = 0;
        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                result = s1.charAt(i) - s2.charAt(i);
                break;
            }
        }
        if (result == 0) result = s1.length() - s2.length();
        if (result < 0)
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
        else if (result > 0)
            System.out.println("\"" + s1 + "\" comes after \"" + s2 + "\" in lexicographical order");
        else
            System.out.println("Both strings are equal");
    }
}