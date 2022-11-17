package com.event.caluculator;

import java.util.Scanner;

import static java.lang.Integer.sum;

public class AddTwoNumber {
    public static void main(String args[]){
        int num1,num2,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num1:");
        num1=sc.nextInt();
        System.out.println("enter the num2:");
        num2=sc.nextInt();
        sum=sum(num1,num2);
        System.out.println("the sum of two numbers num1 and num2 is "+sum);



    }
}
