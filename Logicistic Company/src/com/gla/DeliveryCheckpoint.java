package com.gla;

class DeliveryCheckpoint extends CheckPoint{
    public DeliveryCheckpoint(String checkPointId,String locationName,int distanceFromLast,int expectedDuration,int actualDuration){
        super(checkPointId,locationName,distanceFromLast,expectedDuration,actualDuration);
    }

    @Override
    boolean isCritical() {
        return true;
    }

    @Override
    String getType() {
        return "DeliveryCheckpoint";
    }

    @Override
    double calculatePenalty() {
        if(isDelayed()){
            return (actualDuration - expectedDuration)*2;
        }
        return 0;
    }

}
