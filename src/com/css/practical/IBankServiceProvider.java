package com.css.practical;

public interface IBankServiceProvider {
    BankAccount checkAccount(String accountNo);
    double getBalance(BankAccount account);
    boolean depositMoney(BankAccount account,double amount);
    boolean withdrawAmount(BankAccount account,double amount);
    boolean transerMoney(BankAccount fromAccount, BankAccount toAccount, double amount);
}
