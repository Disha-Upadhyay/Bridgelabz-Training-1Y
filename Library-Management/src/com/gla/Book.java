package com.gla;

public class Book {
    private Category category;
    private int id;
    private String title;
    private String author;
    private boolean isIssued;
    private int price;
    private String publisher;



    public Book(int id, String title, String author, Category category,String publisher, int price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.publisher=publisher;
        this.price = price;
        this.isIssued = false;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }
    public void issueBook() { isIssued = true; }
    public void returnBook() { isIssued = false; }

    public void display() {
        System.out.println("ID=" + id + ", Title=" + title + ", Author=" + author +
                ", Category=" + category + ", Issued=" + isIssued);
    }
}
