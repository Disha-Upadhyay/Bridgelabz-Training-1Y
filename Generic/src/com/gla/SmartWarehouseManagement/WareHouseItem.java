package com.gla.SmartWarehouseManagement;

public class WareHouseItem {
    protected String name;
    protected double price;

    public WareHouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getDetails() {
        return name + " - ₹" + price;
    }
}
