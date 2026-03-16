package com.gla;

public class CurrentAccount extends Account {
    CurrentAccount(int accountNumber,double balance){
        super(accountNumber,balance);
    }
    @Override
    double calculateInterest(){
        double interest = balance*0.20;
        return balance+interest;
    }

}
