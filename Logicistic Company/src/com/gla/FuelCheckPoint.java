package com.gla;

public class FuelCheckPoint extends CheckPoint{
    public FuelCheckPoint(String checkPointId,String locationName,int distanceFromLast,int expectedDuration,int actualDuration){
        super(checkPointId,locationName,distanceFromLast,expectedDuration,actualDuration);
    }

    @Override
    boolean isCritical() {
        return true;
    }

    @Override
    String getType() {
        return "FuelCheckPoint";
    }

    @Override
    double calculatePenalty() {
        if(isDelayed()){
            return 10;
        }
        return 0;
    }

}
