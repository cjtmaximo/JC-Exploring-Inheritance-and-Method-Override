package org.example;

public class BankAccount {
    protected double balance; // Changed from private to protected so the subclass (CheckingAccount) can also access the balance

    public BankAccount(double startingBalance) {
        this.balance = startingBalance;
    }

    public double getBalance() {
        return this.balance;
    }
}