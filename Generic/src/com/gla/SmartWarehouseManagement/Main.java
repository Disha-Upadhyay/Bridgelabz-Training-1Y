package com.gla.SmartWarehouseManagement;

public class Main {
    public static void main(String[] args) {

        Storage<Electronic> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronic("Laptop", 75000));
        electronicsStorage.addItem(new Electronic("Mobile", 25000));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice", 60));
        groceryStorage.addItem(new Groceries("Milk", 50));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 2000));
        furnitureStorage.addItem(new Furniture("Table", 5000));

        System.out.println("Electronics:");
        WareHouseUtils.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries:");
        WareHouseUtils.displayItems(groceryStorage.getItems());

        System.out.println("\nFurniture:");
        WareHouseUtils.displayItems(furnitureStorage.getItems());
    }
}
