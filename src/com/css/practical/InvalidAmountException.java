package com.css.practical;

public class InvalidAmountException extends Exception{
    double amount;
    double balance;
    public InvalidAmountException(String msg)
    {
        super(msg);
    }
}
