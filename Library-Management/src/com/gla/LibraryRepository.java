package com.gla;
import java.util.ArrayList;
import java.util.List;

public class LibraryRepository {
    private List<Book> bookList = new ArrayList<>();
    public void addBook(Book book){
        bookList.add(book);
    }

    public List<Book> getAllBooks() {
        return bookList;
    }
    public Book findBookById(int id) {
        for (Book b : bookList) {
            if (b.getId() == id)
                return b;
        }
        return null;
    }
}
