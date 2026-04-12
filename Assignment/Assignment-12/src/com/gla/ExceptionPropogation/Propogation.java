package com.gla.ExceptionPropogation;

public class Propogation {
    static void method1(){
        double result=10/0;
    }
    static void method2(){
        method1();
    }
    public static void main(String[] args){
        try {
            method2();
        } catch (ArithmeticException e){
            System.out.println("Handled exception in main.");
        }
    }
}
