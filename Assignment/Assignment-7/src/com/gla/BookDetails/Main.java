package com.gla.BookDetails;

public class Main {
    public static void main(String[] args){
        Book b1 =new Book();
        b1.display();
        System.out.println();
        Book b2=new Book("Java","James",2000);
        b2.display();
    }

}
