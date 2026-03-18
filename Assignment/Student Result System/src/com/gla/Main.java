package com.gla;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll number:");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter name:");
        String name = sc.nextLine();

        System.out.println("Enter Marks:");
        int marks = sc.nextInt();

        System.out.println("Enter Branch:");
        String branch = sc.next();

        EngineeringStudent e = new EngineeringStudent(rollNo,name,marks,branch);

        e.calculateGrade();

    }
}
