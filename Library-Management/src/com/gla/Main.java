package com.gla;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        LibraryRepository repo = new LibraryRepository();
        LibraryService service = new LibraryService(repo);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Add 2.Show 3.Issue 4.Return 5.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    sc.nextLine();
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Title: ");
                    String title = sc.nextLine();

                    System.out.print("Author: ");
                    String author = sc.nextLine();

                    System.out.print("Publisher: ");
                    String publisher = sc.nextLine();

                    System.out.print("Price: ");
                    int price = sc.nextInt();

                    System.out.println("Category:");
                    for (Category c : Category.values()) {
                        System.out.println(c);
                    }

                    Category category = Category.valueOf(sc.next().toUpperCase());

                    service.addBook(new Book(id, title, author, category, publisher, price));
                    break;

                case 2:
                    service.showBooks();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    service.issueBook(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    service.returnBook(sc.nextInt());
                    break;

                case 5:
                    System.exit(0);
            }
        }

    }
}
