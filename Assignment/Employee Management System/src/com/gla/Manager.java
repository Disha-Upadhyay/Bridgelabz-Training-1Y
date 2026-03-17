package com.gla;

public class Manager extends Employee {
    String department;
    public Manager(int empId,String name,String department){
        super(empId, name);
        this.department = department;
    }
    @Override
    public String generateEmail(){
        return name.toLowerCase()+"."+department.toLowerCase()+"@company.com";
    }


}
