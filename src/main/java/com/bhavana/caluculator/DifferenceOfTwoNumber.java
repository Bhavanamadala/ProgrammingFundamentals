package com.bhavana.caluculator;

import java.util.Scanner;

public class DifferenceOfTwoNumber {
    public static  void main(String args[]){
        int num1 ,num2,difference;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num1:");
        num1=sc.nextInt();
        System.out.println("enter the num2:");
        num2=sc.nextInt();
        if(num1>num2){
            difference =  num1 - num2;

        }
        else{
            difference =  num1 - num2;
        }
        System.out.println("(\"The difference between \" + num1 + \" and \" + num2 + \" is \" "+ difference);


    }
}
