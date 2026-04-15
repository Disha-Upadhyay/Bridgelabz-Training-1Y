package com.gla.GenericBox;

public class Box<T>{
    private T value;

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }

    public static void main(String[] args) {

        Box<Integer> intBox=new Box<>();
        intBox.set(10);
        System.out.println("Integer value:"+intBox.get());

        Box<String> stringBox=new Box<>();
        stringBox.set("Hello");
        System.out.println("String value:"+stringBox.get());

        Box<Double> doubleBox=new Box<>();
        doubleBox.set(4.5);
        System.out.println("Double value:"+doubleBox.get());
    }
}
