package com.gla;

public class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo,String name,int marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    void calculateGrade(){
        if(marks >= 90)
            System.out.println("A");
        else if (marks >= 70)
            System.out.println("B");
        else if (marks >= 50)
            System.out.println("C");
        else  if(marks >= 33)
            System.out.println("D");
        else
            System.out.println("Fail");
    }
}
