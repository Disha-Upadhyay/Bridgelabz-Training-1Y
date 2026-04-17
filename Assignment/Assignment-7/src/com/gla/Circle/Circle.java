package com.gla.Circle;

public class Circle {
    double radius;

    Circle(){
        this(1.0);
    }
    Circle(double r){
        radius=r;
    }
    double Area(){
        return 3.14*radius*radius;
    }
    void display(){
        System.out.println("Radius:"+radius);
        System.out.println("Area:"+Area());
    }
    public static void main(String[] args){
        Circle c1=new Circle();
        c1.display();
        System.out.println();
        Circle c2=new Circle(4);
        c2.display();
    }
}
