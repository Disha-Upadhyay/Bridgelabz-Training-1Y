package com.gla;

public class Student extends  Person {
    private int rollnumber;
    private  int year;
    private Branch branch;

    Student(int id,String name,String email,int rollnumber,int year,Branch branch){
        super(id,name,email);
        this.rollnumber=rollnumber;
        this.year=year;
        this.branch=branch;
    }
    public int getRollNumber() {

        return rollnumber;
    }

    public void setRollNumber(int rollnumber) {

        this.rollnumber = rollnumber;
    }

    public int getYear() {

        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Branch getBranch() {

        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
    @Override
    public String toString(){
        return super.toString()+", Roll:"+rollnumber+", Year:"+year+", Branch:"+branch;
    }
}
