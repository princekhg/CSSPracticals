package com.css.practical;

// Bank Class
public class Bank implements IBankServiceProvider{
    private BankAccount accounts[];
    private static int lastAssignedNo=0;

    public void setAccounts(BankAccount[] accounts) {
        this.accounts = accounts;
    }

    public BankAccount[] getAccounts() {
        return accounts;
    }

    public static void main(String[] args) {
        Bank sbi=new Bank();
        BankAccount[] account=new BankAccount[3];
        account[0]=new BankAccount(String.valueOf(++lastAssignedNo),"Xavier",67893.4);
        account[1]=new BankAccount(String.valueOf(++lastAssignedNo),"Prince",60993.4);
        account[2]=new BankAccount(String.valueOf(++lastAssignedNo),"Joel",632693.4);
        sbi.setAccounts(account);
        BankAccount[] bank1=sbi.getAccounts();
        for(BankAccount bk:bank1)
            System.out.println("Account Name - " +bk.getAccountName()+ "\n Account Number - "+bk.getAccountNo()+ "\n Account Balance - "+bk.getBalance());
    }

    @Override
    public BankAccount checkAccount(String accountNo) {
        for(BankAccount bk:accounts)
            if(bk.getAccountNo()==accountNo)
                return bk;
        return null;
    }

    @Override
    public double getBalance(BankAccount account) {
        if(account!=null)
        return account.getBalance();
        return 0;
    }

    @Override
    public boolean depositMoney(BankAccount account, double amount) {
            if(checkAccount(account.getAccountNo())!=null) {
                try {
                    if (account.getBalance() < amount)
                        throw new InvalidAmountException("Insufficient Amount");
                    else {
                        account.deposit(amount);
                        return true;
                    }
                }
                    catch(InvalidAmountException iae){
                        System.out.println(iae.getMessage());
                    }
                }
        return false;
    }

    @Override
    public boolean withdrawAmount(BankAccount account, double amount) {
        if (checkAccount(account.getAccountNo()) != null) {
                try {
                    if(account.getBalance()<amount)
                     throw new InsufficientFundException("Insufficient Balance");
                    else if(amount<=0 ||amount>0 && amount<100)
                    {
                        throw new InvalidAmountException("Invalid Amount! \n Please Enter amount in multiple of 100");
                    }
                    else{
                        account.withdraw(amount);
                        return true;
                    }
                } catch (InsufficientFundException e) {
                    e.printStackTrace();
                }catch (InvalidAmountException e) {
                    System.out.println(e.getMessage());
                }

        }
        return false;
    }

    @Override
    public boolean transerMoney(BankAccount fromAccount, BankAccount toAccount, double amount) {
        if(fromAccount!=null && toAccount!=null && amount!=0)
        {
            try {
                if (fromAccount.getBalance() < amount) {
                    throw new InsufficientFundException("Low Balance......");
                }
                if(amount<=0 ||amount>0 && amount<100)
                {
                    throw new InvalidAmountException("Invalid Amount! \n Please Enter amount in multiple of 100");
                }
                fromAccount.withdraw(amount);
                toAccount.deposit(amount);
            }catch (InsufficientFundException isb){
                System.out.println(isb.getMessage());
            } catch (InvalidAmountException e) {
                System.out.println(e.getMessage());
            }
        }
        return false;
    }
}
