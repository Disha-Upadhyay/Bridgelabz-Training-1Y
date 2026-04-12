package com.gla.BankTransactionSystem;

import javax.naming.InsufficientResourcesException;
public class BankAccount {
    double balance;

    public BankAccount(double balance) {
        this.balance=balance;}

    void withdraw(double amount)
            throws InsufficientBalanceException,IllegalArgumentException{

        if(amount<0){
            throw new IllegalArgumentException("Invalid amount!");
        }
        if(amount>balance){
            throw new InsufficientBalanceException("insufficient balance!");
        }
        balance = balance-amount;
        System.out.println("Withdrawal successful,new balance:"+balance);
    }
}
