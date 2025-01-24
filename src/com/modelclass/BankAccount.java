package com.modelclass;

public class BankAccount {
    public int accountHoldersNumber=2958630;
    public double balance=100;

    public void Deposit(double amount){
        balance=amount+balance;
    }
    public boolean Withdraw(double amount){
        if (balance>0){
            balance -= amount;
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
