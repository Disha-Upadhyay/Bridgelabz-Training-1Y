package com.gla;

public class Driver {
    String driverId;
    String name;
    RouteLinkedList<CheckPoint> routeHistory;

   public Driver(String driverId,String name){
        this.driverId=driverId;
        this.name=name;
       this.routeHistory = new RouteLinkedList<>();

    }
    public void showSummary(){
        System.out.println("Driver: " + driverId + " _ " + name);
        System.out.println("Route Summary: ");
 ;
        routeHistory.printRoute();

        double totalDistance = routeHistory.computeTotalDistance();
        double totalPenalty = routeHistory.computeTotalPenalty();

        double routeScore = totalDistance - totalPenalty;

        System.out.println("Total Distance: " + totalDistance + " km");
        System.out.println("Total Penalty: " + totalPenalty);
        System.out.println("Route Score: " + routeScore);

        System.out.println("Critical Route Check: " +
                (routeHistory.checkCritical()
                        ? "All required checkpoints present"
                        : "Missing critical checkpoints"));
    }




}
