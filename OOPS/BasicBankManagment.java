package OOPS;

import javax.xml.transform.Source;

public class BasicBankManagment {
    public static void main(String[] args) {
            Account s1 = new SavingsAccount();
            s1.deposit(5000);
            s1.withdrawAmount(2000);
            s1.displayBalance();

            Account c1 = new CurrentAccount();
            c1.deposit(10000);
            c1.withdrawAmount(2500);
            c1.displayBalance();
    }
}

abstract class Account{
    private static int accountNumber = 100;
    private double balance;

    Account(){
        Account.accountNumber += 1;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void withdrawAmount(double amount){
          this.balance = balance - amount;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    void displayBalance(){
        System.out.println("Account Number :" + accountNumber);
        System.out.println("Current Balance :" + getBalance());
    }
}

class SavingsAccount extends Account{
    void deposit(double amount){
         setBalance(amount);
        System.out.println("Depositing" + amount + "into Savings Account...");
    }
    void withdraw(double amount){
            withdrawAmount(amount);
           System.out.println("Withdrawing"+ " " + amount + " " + "from Savings Account...");
    }
}

class CurrentAccount extends Account{
    void deposit(double amount){
        setBalance(amount);
        System.out.println("Depositing" + " " + amount + " " + "into Current Account...");
    }
    void withdraw(double amount){
        withdrawAmount(amount);
        System.out.println("Withdrawing"+ amount + "from Current Account...");
    }
}