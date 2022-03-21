package com.css.practical;

public class InsufficientFundException extends Exception{
    double amount;
    public InsufficientFundException(String msg)
    {
        super(msg);
    }
}
