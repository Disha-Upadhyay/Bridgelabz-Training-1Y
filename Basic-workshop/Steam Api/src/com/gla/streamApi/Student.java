package com.gla.streamApi;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private int id;
   private String name;
   private int age;
    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age=age;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {


        List<Student> list = new ArrayList<>();
        Student S1 = new Student(18, "Disha", 18);

        Student S2 = new Student(14, "Deeksha", 22);
        Student S3 = new Student(6, "Anshika", 20);
        list.add(S1);
        list.add(S2);
        list.add(S3);
        list.stream()
                .filter( s -> s.getAge() > 20)
        .forEach(s -> System.out.println(s.getAge()));

    }

}
