package com.gla.BookDetails;

public class Book {
    String title;
    String author;
    double price;

    Book(){
        title="Unknown";
        author="Unknown";
        price=0.0;
    }
    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void display(){
        System.out.println("title:"+title);
        System.out.println("Author:"+author);
        System.out.println("Price:"+price);

    }
}
