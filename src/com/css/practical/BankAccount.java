package com.css.practical;

public class BankAccount {
    private String accountNo;
    private String accountName;
    private double balance;
    // constructor with default value
    public BankAccount()
    {
        accountName="Shubham";
        accountNo="101203123";
        balance=1000.40;
    }
// constructor to set accountNo.
    // constructor with only accountName and Balance
    public BankAccount(String accountNo,String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
        this.accountNo=accountNo;
    }
    // constructor to intilialize with accountno and account name
     public BankAccount(String accountNo, String accountName) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        balance=1000;
    }
    public String getAccountNo() {return accountNo;}
    public void setAccountNo(String accountNo) {this.accountNo = accountNo;}
    public String getAccountName() {return accountName;}
    public void setAccountName(String accountName) {this.accountName = accountName;}
    public double getBalance() {return balance;}
    public void setBalance(double balance) {this.balance = balance;}
    public double deposit(double amount){
        setBalance(balance+amount);
        return (balance+amount);
    }

    public double withdraw(double amount){ setBalance(balance-amount); return (balance-amount);}

    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        System.out.println("After default constructor execution  --- ");
        System.out.println("Account Name  = " +ba.accountName + "\n Account Number - "+ ba.accountNo + "\n Balance = "+ba.balance);
        BankAccount b=new BankAccount("12054823","Prince");
        System.out.println("After Parameterized Overloaded constructor execution  --- ");
        System.out.println("Account Name  = " +b.accountName + "\n Account Number - "+ b.accountNo + "\nBalance = "+b.balance);
    }


}
