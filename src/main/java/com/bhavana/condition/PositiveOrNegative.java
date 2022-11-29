package com.bhavana.condition;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print(" enter the number :");
        n = sc.nextInt();
        if(n>0){
            System.out.println("The given number "+n+" is Positive");
        } else if (n<0) {
            System.out.println("The given number "+n+" is Negative");

        }else {
            System.out.println("The given number "+n+" is neither Negative nor Positive ");



    }
    }
}
