package com.gla.CompareTwoValues;

public class Compare {
    public static <T> boolean isEqual(T a,T b){
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        return  a.equals(b);
    }

    public static void main(String[] args) {

        System.out.println(Compare.isEqual(10,10));

        System.out.println(Compare.isEqual("Hello","Hello"));

        System.out.println(Compare.isEqual("Hi","Bye"));

        System.out.println(Compare.isEqual(null,null));
        System.out.println(Compare.isEqual(null,"Test"));
    }
}
