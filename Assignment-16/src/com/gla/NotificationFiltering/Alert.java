package com.gla.NotificationFiltering;

public class Alert {
    String message;
    String type;
    int priority;

    Alert(String message,String type,int priority){
        this.message=message;
        this.type=type;
        this.priority=priority;
    }
}
