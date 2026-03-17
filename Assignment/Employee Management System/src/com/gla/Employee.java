package com.gla;

public class Employee {
    int empId;
    String name;
    public  Employee(int empId,String name){
        this.empId=empId;
        this.name=name;
    }

    public String generateEmail(){
        return name.toLowerCase()+"@company.com";
    }
}
