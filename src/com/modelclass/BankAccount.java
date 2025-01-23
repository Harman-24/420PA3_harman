package com.modelclass;

public class BankAccount {
    public String accountHoldersName;
    public double balance=100;

    public void Deposit(double amount){
        balance=amount+balance;
    }
    public boolean Withdraw(){
        if (balance>0){
            return true;
        }
        else {
            return false;
        }

    }
    public double GetBalance(){
        return balance;
    }
}
