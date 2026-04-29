package com.gla;
import java.util.ArrayList;

public class LibraryService {
    private LibraryRepository repository;
    public LibraryService(LibraryRepository repository){
        this.repository=repository;
    }
    public void addBook(Book book){
        repository.addBook(book);
    }
    public void showBooks(){
        for(Book b:repository.getAllBooks()){
            b.display();
        }
    }

    public boolean issueBook(int id) {
        Book b = repository.findBookById(id);

        if (b == null) {
            System.out.println("Book not found");
            return false;
        }

        if (!b.isIssued()) {
            b.issueBook();
            System.out.println("Book issued");
            return true;
        }

        System.out.println("Already issued");
        return false;
    }
    public boolean returnBook(int id){
        Book b=repository.findBookById(id);
        if(b==null){
            System.out.println("Book not found");
            return false;
        }
        if (b.isIssued()){
            b.returnBook();
            System.out.println("Book returned");
            return true;
        }
        System.out.println("Book was not issued");
        return false;
    }
}





