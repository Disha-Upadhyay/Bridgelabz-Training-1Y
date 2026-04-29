package com.gla;

public class FuelCheckPoint extends CheckPoint{
    public FuelCheckPoint(String checkPointId,String locationName,int distanceFromLast,int expectedDuration,int actualDuration){
        super(checkPointId,locationName,distanceFromLast,expectedDuration,actualDuration);
    }


    public boolean isCritical() {

        return true;
    }

    public String getType() {

        return "FuelCheckPoint";
    }


    public double calculatePenalty() {
        if(isDelayed()){
            return 10;
        }
        return 0;
    }

}
