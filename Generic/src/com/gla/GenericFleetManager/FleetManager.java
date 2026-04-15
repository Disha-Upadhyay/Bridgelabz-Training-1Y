package com.gla.GenericFleetManager;
import java.util.ArrayList;
import java.util.List;


public class FleetManager <T extends Vehicle>{
    private List<T> fleet = new ArrayList<>();


    public void addVehicle(T vehicle) {
        fleet.add(vehicle);
    }


    public void showFleet() {
        for (T vehicle : fleet) {
            System.out.println(vehicle.getName());
        }
    }
}
