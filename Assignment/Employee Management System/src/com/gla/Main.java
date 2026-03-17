package com.gla;
     import com.gla.Employee;
import com.gla.Manager;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Id:");
        int empId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Department:");
        String department = sc.nextLine();

        Employee e = new Employee(empId,name);
        Manager m = new Manager(empId,name,department);

        System.out.println("Employee Email Id:"+e.generateEmail());
        System.out.println("Manager Email Id:"+m.generateEmail());
    }
}
