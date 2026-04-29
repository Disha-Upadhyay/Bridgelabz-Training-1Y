package com.gla;

 public abstract class CheckPoint {
    protected String checkPointId;
    protected String locationName;
    protected double  distanceFromLast;
    protected int expectedDuration;
    protected int actualDuration;

   public CheckPoint(String checkPointId,String locationName,int distanceFromLast,int expectedDuration,int actualDuration){
       this.checkPointId=checkPointId;
       this.locationName=locationName;
       this.distanceFromLast=distanceFromLast;
       this.expectedDuration=expectedDuration;
       this.actualDuration=actualDuration;

   }
  public boolean isDelayed(){

       return actualDuration>expectedDuration;
   }

   public abstract boolean isCritical();

    public abstract String getType();
   public abstract double calculatePenalty();

     public String getCheckPointId() {
         return checkPointId;
     }

     public double getDistanceFromLast() {
         return distanceFromLast;
     }
     @Override
     public String toString() {
         return getType() + " _ " + locationName + " _ " + (isDelayed() ? "Delayed" : "On Time") + " _ Penalty: " + calculatePenalty();
     }
 }

