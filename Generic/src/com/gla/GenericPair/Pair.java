package com.gla.GenericPair;

public class Pair <T, U>{
    private  T First;
    private  U Second;

    public Pair(T First, U Second) {
        this.First=First;
        this.Second=Second;
    }

    public T getFirst() {
        return First;
    }


    public U getSecond() {
        return Second;
    }

    public static void main(String[] args) {

        Pair<String,Integer> student=new Pair<>("Amol",20);

        System.out.println("Name:"+student.getFirst());
        System.out.println("Age:"+student.getSecond());
    }


}
