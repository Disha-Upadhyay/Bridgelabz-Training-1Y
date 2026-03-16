package com.gla;

public class Order {
    int orderId;
    double baseAmount;

    static int delieveryCharge = 40;
    Order(int orderId, double baseAmount){
        this.orderId = orderId;
        this.baseAmount = baseAmount;
    }
    double calculateBill(){
        return baseAmount+delieveryCharge;
    }
}
