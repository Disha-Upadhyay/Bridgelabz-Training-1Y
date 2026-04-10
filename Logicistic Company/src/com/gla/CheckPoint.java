package com.gla;

abstract class CheckPoint {
    String checkPointId;
    String locationName;
    double  distanceFromLast;
    int expectedDuration;
    int actualDuration;

   public CheckPoint(String checkPointId,String locationName,int distanceFromLast,int expectedDuration,int actualDuration){
       this.checkPointId=checkPointId;
       this.locationName=locationName;
       this.distanceFromLast=distanceFromLast;
       this.expectedDuration=expectedDuration;
       this.actualDuration=actualDuration;

   }
   boolean isDelayed(){
       return actualDuration>expectedDuration;
   }

   abstract boolean isCritical();

    abstract String getType();
   abstract double calculatePenalty();



}
