package com.event.caluculator;

import java.util.Scanner;

import static java.lang.Integer.sum;

public class SubtractTwoNumber {
    public static void main(String args[]) {
        int num1, num2, subtract;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num1:");
        num1 = sc.nextInt();
        System.out.println("enter the num2:");
        num2 = sc.nextInt();
        subtract =num1-num2;
        System.out.println("the subtract of num1 and num2 is " + subtract);


    }
}
