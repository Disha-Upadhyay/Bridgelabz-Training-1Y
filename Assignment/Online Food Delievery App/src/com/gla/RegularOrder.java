package com.gla;

public class RegularOrder extends Order{
    RegularOrder(int orderId,double baseAmount){
        super(orderId, baseAmount);
    }
    @Override
    double calculateBill(){
        return baseAmount+delieveryCharge;
    }
}
