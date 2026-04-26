/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Nasiha
 * Student Id – 33150863 
 * Batch – 2
 */
import java.util.Date;
// class to display bank account
class Account {
    private int ac_id=1; // default account id
    private double ac_balance=0.0; // default account balance
    private static double annualInterestRate=0.0; // annual interest rate
    private Date ac_dateCreated; // account creation date
    
    public Account(){
        // set accont creation date to cuurrent date
        this.ac_dateCreated=new Date();
    }
    
    // constructor that initializes account id, balance, date
    public Account(int id, double balance){
        this.ac_id=id;
        this.ac_balance=balance;
        this.ac_dateCreated=new Date();
    }
    
    // getter for account id
    public int getAc_id(){
        return ac_id;
    }
    
    // setter for account id
    public void setAc_id(int id){
        this.ac_id=id;
    }
    
    // getter for account balance
    public double getAc_balance(){
        return ac_balance;
    }
    
    // setter for accouunt balance
    public void setAc_balance(double balance){
        this.ac_balance=balance;
    }
    
    // getter for annual interest rate
    public static double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    // setter for annual interest rate
    public static void setAnnualInterestRate(double rate){
        annualInterestRate=rate;
    }
    
    // getter for account creation date
    public Date getAc_dateCreated(){
        return ac_dateCreated;
    }
    
    // method to calculate monthly interest rate
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    
    // method to withdraw specified amount
    public void withdraw(double amount){
        // reduce the amount from balance
        ac_balance-=amount;
    }
    
    // method to deposit specified amount
    public void deposit(double amount){
        // add the amount to balance
        ac_balance+=amount;
    }
}
// Main class to use Account class
public class BankAccount{
    public static void main(String[] args) {
        // create account with id and balance
        Account account = new Account(1001,30000);
        
        // set annual interest rate
        Account.setAnnualInterestRate(5.5);
        
         // print account details
        System.out.println("Account ID: " + account.getAc_id());
        System.out.println("Balance: $" + account.getAc_balance());
        System.out.println("Monthly Interest Rate: " + 
                account.getMonthlyInterestRate() + "%");
        System.out.println("Date Created: " + account.getAc_dateCreated());
        
        // withdraw 3500 from account
        account.withdraw(3500);
        System.out.println("After withdrawing $3500, balance is " 
                + account.getAc_balance());
        
        // deposit 4500 to account
        account.deposit(4500);
        System.out.println("After depositing $4500, balance is " 
                + account.getAc_balance());
    }
}

