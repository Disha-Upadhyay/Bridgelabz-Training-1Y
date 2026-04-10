package com.gla;

public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void bookTicket(String Name,int seat,double cost){
        movieName=Name;
        seatNumber=seat;
        price=cost;
    }
    void display(){
        System.out.println("Movie name:"+movieName);
        System.out.println("Seat number:"+seatNumber);
        System.out.println("Price:"+price);
    }
}
