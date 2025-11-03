package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Portfolio p = new Portfolio("Nachi Portfolio","Hignacio");
        BankAccount b = new BankAccount("Bank1","1234",0);
        CreditCard c = new CreditCard("Discover","4265",0);

        b.Deposit(1000);
        c.Charge(100);
        c.Charge(400);

        b.Withdraw(100);
        c.Pay(300);

        p.add(b);
        p.add(c);

        System.out.println("Your Bank account balance is : " + b.getValue());
        System.out.println(c.getValue());

    }
}