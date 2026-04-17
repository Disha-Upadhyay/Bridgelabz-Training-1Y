package com.gla.HotelBooking;
import java.util.Scanner;
public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking(){
        guestName="Unknown";
        roomType="Unknown";
        nights=0;
    }
    HotelBooking(String guestName,String roomType,int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }
    HotelBooking(HotelBooking h){
        guestName=h.guestName;
        roomType=h.roomType;
        nights=h.nights;
    }
    void display(){
        System.out.println("Guest name:"+guestName);
        System.out.println("Room type:"+roomType);
        System.out.println("Nights:"+nights);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Guest name:");
        String guestName=sc.nextLine();
        System.out.println("Enter Room type:");
        String roomType=sc.nextLine();
        System.out.println("Enter Nights:");
        int nights= sc.nextInt();
        HotelBooking h1 =new HotelBooking();
        System.out.println("Default");
        h1.display();
        HotelBooking h2=new HotelBooking(guestName,roomType,nights);
        System.out.println("Parameterized");
        h2.display();
        HotelBooking h3=new HotelBooking(h2);
        System.out.println("Copied");
        h3.display();
    }
}
