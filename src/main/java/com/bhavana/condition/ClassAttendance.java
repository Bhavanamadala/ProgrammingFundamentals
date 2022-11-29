package com.bhavana.condition;

import java.util.Scanner;

public class ClassAttendance {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("no of classes held: ");
        int x=sc.nextInt();
        System.out.println("no of classes attend: ");
        int y=sc.nextInt();
        float ca;
        ca=((y*100)/x) ;

        System.out.println( ca+"%"+" class attendance");

        if(ca>=75)
            System.out.println("The student will be allowed to sit for the exam");
        else
            System.out.println(" The student will not be allowed to sit for the exam");
    }
}
