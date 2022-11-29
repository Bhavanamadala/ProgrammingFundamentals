package com.bhavana.ATM;

import java.util.Scanner;

public class AtmMachineUsingLoop {
    public static void displayBalance(int balance) {
        System.out.println("Current Balance : " + balance);
    }

    public static int amountWithdrawing(int balance, int withdrawAmount) {
        System.out.println("Withdrawing Amount : " + withdrawAmount);
        if (balance >= withdrawAmount) {
            balance = balance - withdrawAmount;
            System.out.println("Please collect your money and collect the card");
            displayBalance(balance);
        } else {
            System.out.println("Sorry! Insufficient Funds");
        }
        return balance;
    }

    public static int amountDepositing(int balance, int depositAmount) {
        System.out.println("Depositing Amount : " + depositAmount);
        balance = balance + depositAmount;
        System.out.println("Your Money has been successfully deposited");
        displayBalance(balance);
        return balance;
    }

    public static void main(String args[]) {
        int balance = 10000, Withdraw, Deposit;
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.print("Enter money to be Withdraw:");

        Withdraw = sc.nextInt();
        if (balance >= Withdraw) {

            balance = balance - Withdraw;
            System.out.println("Please collect your money");
        } else {

            System.out.println("Insufficient Balance");
        }
        System.out.println("");
        System.out.print("Enter money to be Deposit:");
        Deposit = sc.nextInt();
        balance = balance + Deposit;
        System.out.println("successfully Deposit");
        System.out.println("");

        System.out.println("Balance : " + balance);
        System.out.println("");
    }
}
