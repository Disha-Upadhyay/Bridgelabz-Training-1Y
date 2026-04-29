package com.gla;

public class Main {
    public static void main(String[] args)  {


        Driver d = new Driver("D1204", "Kavita Nair");
        d.routeHistory.addCheckpoint(
                new DeliveryCheckpoint("C1", "Warehouse A", 50, 30, 40));

        d.routeHistory.addCheckpoint(
                new FuelCheckPoint("C2", "Pump 12", 30, 15, 15));

        d.routeHistory.addCheckpoint(
                new RestCheckPoint("C3", "Motel X", 60, 20, 25));

        d.routeHistory.addCheckpoint(
                new DeliveryCheckpoint("C4", "Client Hub", 10, 30, 45));

        d.showSummary();

    }

}
