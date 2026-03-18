package com.gla;

public class EngineeringStudent extends Student{
    String branch;
    EngineeringStudent(int rollNo,String name,int marks,String branch){
        super(rollNo,name,marks);
        this.branch=branch;

        this.name = name+"-"+branch;

    }
    @Override
    void calculateGrade(){
        System.out.println("RollNo:"+rollNo);
        System.out.println("Name:"+name);
        System.out.println("Marks:"+marks);
    }
}
