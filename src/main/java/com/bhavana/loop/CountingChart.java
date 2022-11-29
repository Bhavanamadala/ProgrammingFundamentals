package com.bhavana.loop;

import java.util.Scanner;

public class CountingChart {
    private static Scanner sc;
    public static void main(String[] args) {

        int number, i = 1;

        sc = new Scanner(System.in);

        System.out.print(" Please Enter any Number : ");
        number = sc.nextInt();
        if(i<=1){
            System.out.println("1-One");
        }

        if (i<=2){
            System.out.println("2-Two");

        }if (i<=3){
            System.out.println("3-three");
        }if (i<=4){
            System.out.println("4-four");
        }if (i<=5){
            System.out.println("5-five");
        }if (i<=6){
            System.out.println("6-six");
        }if (i<=7){
            System.out.println("7-seven");
        }if (i<=8){
            System.out.println("8-eight");
        }if (i<=9){
            System.out.println("9-nine");
        }if (i<=10){
            System.out.println("10-ten");
        }
    }

}
