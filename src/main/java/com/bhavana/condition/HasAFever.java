package com.bhavana.condition;

import java.util.Scanner;

public class HasAFever {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the temperature :");
        n = sc.nextInt();
        if(n>100){
            System.out.println("you have a fever");
        }
        else {
            System.out.println("you don't have fever");



        }
    }
}
