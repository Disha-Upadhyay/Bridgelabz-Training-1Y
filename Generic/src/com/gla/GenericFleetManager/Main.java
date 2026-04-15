package com.gla.GenericFleetManager;

public class Main {
    public static void main(String[] args) {


    FleetManager<Truck> truckFleet = new FleetManager<>();
    truckFleet.addVehicle(new Truck("Tata Truck"));
    truckFleet.addVehicle(new Truck("Ashok Leyland Truck"));

    System.out.println("Truck Fleet:");
    truckFleet.showFleet();


    FleetManager<Bike> bikeFleet = new FleetManager<>();
    bikeFleet.addVehicle(new Bike("Hero Bike"));
    bikeFleet.addVehicle(new Bike("Yamaha Bike"));

    System.out.println("\nBike Fleet:");
    bikeFleet.showFleet();
}
}
