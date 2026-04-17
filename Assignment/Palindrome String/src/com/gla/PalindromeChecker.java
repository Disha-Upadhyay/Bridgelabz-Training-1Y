package com.gla;

public class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }
        return text.equals(reversed);
    }

    void display() {
        if (isPalindrome()) {
            System.out.println(text + "is a Palindrome");
        } else {
            System.out.println(text + "is not a Palindrome");
        }
    }
}
