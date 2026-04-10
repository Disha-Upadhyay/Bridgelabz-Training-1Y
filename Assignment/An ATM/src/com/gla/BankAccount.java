package com.gla;

public class BankAccount {
    String accountHolder;
    int accountNumber;
    Double balance;

    BankAccount(String accountHolder,int accountNumber,double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    void Depositing(int deposit){
        balance = balance+deposit;
        System.out.println("Deposit money:"+deposit);
    }
    void Withdrawing(int withdraw){
        if(withdraw<=balance) {
            balance = balance - withdraw;
            System.out.println("Withdrawing money:" + withdraw);
        }else{
            System.out.println("Insufficient");
        }
    }
    void display(){

        System.out.println("Current balance:"+balance);
    }
}
