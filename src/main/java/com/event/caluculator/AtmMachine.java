package com.event.caluculator;

import java.util.Scanner;

public class AtmMachine {
    public static void main(String args[]){
        int balance = 100000, Withdraw, Deposit;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Automated Teller Machine");
            System.out.print("\n 1.Withdraw");
            System.out.print(" \n 2.Deposit");
            System.out.print(" \n 3.CheckBalance");
            System.out.print(" \n 4.Exit");
            System.out.print("\n Chose the option");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter money to be Withdraw:");

                    Withdraw = sc.nextInt();


                    if(balance >= Withdraw)
                    {

                        balance = balance - Withdraw;
                        System.out.println("Please collect your money");
                    }
                    else
                    {

                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:

                    System.out.print("Enter money to be Deposit:");

                    Deposit = sc.nextInt();


                    balance = balance + Deposit;
                    System.out.println("successfully Deposit");
                    System.out.println("");
                    break;

                case 3:

                    System.out.println("Balance : "+balance);
                    System.out.println("");
                    break;

                case 4:

                    System.exit(0);
            }
        }
    }
    }

