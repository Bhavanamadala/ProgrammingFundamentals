package com.event.caluculator;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String args[]) {

        int number = (int) ((Math.random() * (100 - 1)) + 1),n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the random-number:");
        n = sc.nextInt();
        if(1>=100){
            System.out.println("congratulations");
            if(100>=n){
                System.out.println("too high:");
                if(1<=n){
                    System.out.println("too low:");
                }
            }


        }

        System. out.println("I'm thinking of a number between 1 and 100.\nYou have 1 tries to guess the number.");

    }
}
