package com.gla;

public class PremiumOrder extends Order{
    PremiumOrder(int orderId, double baseAmount){
        super(orderId, baseAmount);
    }
    @Override
    double calculateBill(){
        double discount = baseAmount*0.20;
        return baseAmount-discount+delieveryCharge;
    }
}
