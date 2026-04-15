package com.gla.SmartWarehouseManagement;

import java.util.ArrayList;
import java.util.List;

public class Storage  <T extends WareHouseItem>{
    private List<T> items = new ArrayList<>();

    // Add item
    public void addItem(T item) {
        items.add(item);
    }

    // Get all items
    public List<T> getItems() {
        return items;
    }
}
