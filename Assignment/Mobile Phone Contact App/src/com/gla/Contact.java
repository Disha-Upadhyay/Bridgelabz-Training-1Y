package com.gla;

public class Contact {
    String name;
    String phoneNumber;

    Contact(String name,String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Phone Number:"+phoneNumber);
    }



}
