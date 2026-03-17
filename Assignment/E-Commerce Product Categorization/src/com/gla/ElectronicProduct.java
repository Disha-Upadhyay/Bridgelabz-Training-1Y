package com.gla;

public class ElectronicProduct extends Product{
    String brandName;
    ElectronicProduct(int productId,String productName,String brandName){
        super(productId,productName);
        this.brandName=brandName;
    }
    @Override
    boolean isMatch(String keyword){
        return productName.toLowerCase().contains(keyword.toLowerCase()) ||brandName.equalsIgnoreCase(keyword);
    }
}
