package com.gla;

public class Product {
    int productId;
    String productName;

    Product(int productId,String productName){
        this.productId = productId;
        this.productName = productName;
    }
    boolean isMatch(String keyword){
        return productName.toLowerCase().contains(keyword.toLowerCase());
    }
}
