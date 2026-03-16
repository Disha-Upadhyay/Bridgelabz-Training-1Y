package com.gla;

import java.net.StandardSocketOptions;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
        Book b1 = new TextBook(101,"Physics",350);
        Book b2 = new Magazine(201,"Science",150);

        System.out.println("Library: "+Book.libraryName);

        System.out.println("TextBook fine: " +b1.calculateFine(3));
        System.out.println("Magazine Fine: " +b2.calculateFine(3));
    }
}
