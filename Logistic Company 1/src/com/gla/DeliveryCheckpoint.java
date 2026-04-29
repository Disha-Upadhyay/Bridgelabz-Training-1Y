package com.gla;

class DeliveryCheckpoint extends CheckPoint{
    public DeliveryCheckpoint(String checkPointId,String locationName,int distanceFromLast,int expectedDuration,int actualDuration){
        super(checkPointId,locationName,distanceFromLast,expectedDuration,actualDuration);
    }


    public boolean isCritical() {
        return true;
    }


    public String getType() {

        return "DeliveryCheckpoint";
    }


    public double calculatePenalty() {
        if(isDelayed()){
            return (actualDuration - expectedDuration)*2;
        }
        return 0;
    }

}
