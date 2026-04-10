package com.gla;

public class RestCheckPoint extends CheckPoint{
    public RestCheckPoint(String checkPointId,String locationName,int distanceFromLast,int expectedDuration,int actualDuration){
        super(checkPointId,locationName,distanceFromLast,expectedDuration,actualDuration);
    }

    @Override
    boolean isCritical() {
        return false;
    }

    @Override
    String getType() {
        return "RestCheckPoint";
    }

    @Override
    double calculatePenalty() {
        if(isDelayed() && (actualDuration-expectedDuration)>30){
            return (actualDuration-expectedDuration)*0.5;
        }
        return 0;
    }

}


