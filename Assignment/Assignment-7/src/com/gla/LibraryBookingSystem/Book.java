package com.gla.LibraryBookingSystem;

import java.util.Scanner;

public class Book {String title;
    String author;
    double price;
    boolean availability;

    Book(String title,String author,double price,boolean availability){
        this.title=title;
        this.author=author;
        this.price=price;
        this.availability=availability;
    }
    void borrow(){
        if(availability){
            availability=false;
            System.out.println("Book borrowed");
        }else{
            System.out.println("Book not borrowed");
        }
    }
    void display(){
        System.out.println("Title:"+title);
        System.out.println("Author:"+author);
        System.out.println("Price:"+price);
        System.out.println("Availability:"+availability);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Title:");
        String title=sc.nextLine();
        System.out.println("Author:");
        String author=sc.nextLine();
        System.out.println("Price:");
        int price=sc.nextInt();
        System.out.println("Availability:");
        boolean availability=sc.nextBoolean();
        Book b1=new Book(title,author,price,availability);
        b1.display();
        Book b2=new Book(title,author,price,availability);
        b2.borrow();
        b2.display();

    }
}
