package com.gla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Movie Name:");
        String Name= sc.nextLine();
        System.out.println("Enter Seat Number:");
        int seat = sc.nextInt();
        System.out.println("Enter Price:");
        double price = sc.nextDouble();

        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket(Name,seat,price);
        ticket.display();

    }
}
