// package bankdetails;

import java.io.Serializable;

public class Bankdetails implements Serializable {
    private String uname;
    private String uaddress;
    private String uaccount;
    private double ubalance;

    // Default constructor
    public Bankdetails() {
    }

    // Parameterized constructor
    public Bankdetails(String uname, String uaddress, String uaccount, double ubalance) {
        this.uname = uname;
        this.uaddress = uaddress;
        this.uaccount = uaccount;
        this.ubalance = ubalance;
    }

    // Getter and Setter for uname
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    // Getter and Setter for uaddress
    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }

    // Getter and Setter for uaccount
    public String getUaccount() {
        return uaccount;
    }

    public void setUaccount(String uaccount) {
        this.uaccount = uaccount;
    }

    // Getter and Setter for ubalance
    public double getUbalance() {
        return ubalance;
    }

    public void setUbalance(double ubalance) {
        this.ubalance = ubalance;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            this.ubalance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.ubalance) {
            this.ubalance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }

    // Method to display account details
    public void details() {
        System.out.println("Account Holder Name: " + this.uname);
        System.out.println("Address: " + this.uaddress);
        System.out.println("Account Number: " + this.uaccount);
        System.out.println("Balance: " + this.ubalance);
    }
}
