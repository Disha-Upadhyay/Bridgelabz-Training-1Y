package com.gla;

public class Circle {
    int radius;

    Circle(int radius){
        this.radius=radius;
    }
    void Calculate(){
        double area = 3.14*radius*radius;
        double circumference = 2*3.14*radius;
        System.out.println("Area of circle:"+area);
        System.out.println("Circumference of circle:"+circumference);
    }

}
