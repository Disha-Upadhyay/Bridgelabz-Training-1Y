package com.gla.Human;

import java.util.Scanner;

public class Person {
    String name;
    int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    Person(Person p){
        name=p.name;
        age=p.age;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name=sc.nextLine();
        System.out.println("Enter Age:");
        int age =sc.nextInt();
        Person p1=new Person(name,age);
        System.out.println("Original");
        p1.display();
        Person p2=new Person(p1);
        System.out.println("Copied");
        p2.display();

    }
}
