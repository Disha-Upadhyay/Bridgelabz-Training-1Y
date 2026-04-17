package com.gla.CarRentalSystem;

import java.util.Scanner;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    CarRental(){
        customerName="Unknown";
        carModel="Unknown";
        rentalDays=0;
    }
    CarRental(String customerName,String carModel,int rentalDays){
        this.customerName=customerName;
        this.carModel=carModel;
        this.rentalDays=rentalDays;
    }
    void TotalCost(int rentalPrice){
        double Total =rentalDays*rentalPrice;
        System.out.println("Total:"+Total);
    }
    void display(){
        System.out.println("Customer name:"+customerName);
        System.out.println("Car model:"+carModel);
        System.out.println("Rental price:"+rentalDays);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Customer name:");
        String customerName= sc.nextLine();
        System.out.println("Car model:");
        String carModel=sc.nextLine();
        System.out.println("Enter rental days:");
        int rentalDays=sc.nextInt();
        System.out.println("Rental price:");
        int rentalPrice=sc.nextInt();
        CarRental c1=new CarRental();
        c1.display();
        CarRental c2=new CarRental(customerName,carModel,rentalDays);
        c2.display();
        c2.TotalCost(rentalPrice);

    }
}
