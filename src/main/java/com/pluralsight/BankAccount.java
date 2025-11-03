package com.pluralsight;

public class BankAccount implements Valuable{

    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void Deposit(double amount){
        balance += amount;
    }

    public void Withdraw(double amount){
        balance -= amount;
    }


    @Override
    public double getValue() {
        return this.balance;
    }
}
