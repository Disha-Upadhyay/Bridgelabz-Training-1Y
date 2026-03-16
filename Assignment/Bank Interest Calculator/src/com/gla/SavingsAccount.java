package com.gla;

public class SavingsAccount extends Account{
    SavingsAccount(int accountNumber, double balance){
        super(accountNumber,balance);
    }
    @Override
    double calculateInterest(){
        double interest = balance*0.40;
        return balance+interest;
    }
}
