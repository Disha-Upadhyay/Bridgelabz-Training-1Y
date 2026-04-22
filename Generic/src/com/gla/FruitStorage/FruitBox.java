package com.gla.FruitStorage;

import java.util.ArrayList;

public class FruitBox <T extends Fruit> {
    private ArrayList<T> fruits =new ArrayList<>();

    public void addFruit(T fruit){
        fruits.add(fruit);
    }
    public void displayFruits(){
        for (T fruit: fruits){
            fruit.display();
        }
    }

}
