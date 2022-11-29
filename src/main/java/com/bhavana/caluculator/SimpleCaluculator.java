package com.bhavana.caluculator;

import java.util.Scanner;

public class SimpleCaluculator {

    public static void main(String[] args) {

        int numberOne;
        int numberTwo;
        int sum=0;
        int dif=0;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Input 1st integer:");
        numberOne= scanner.nextInt();

        System.out.println("Input 2nd integer:");
        numberTwo= scanner.nextInt();

        //sum of two integers

        sum=numberOne+numberTwo;
        System.out.println("Sum of two integers: "+sum);

        //difference of two integers

        if(numberOne > numberTwo)
        {
            dif=numberOne-numberTwo;
        }
        else
        {
            dif=numberTwo-numberOne;
        }

        System.out.println("difference between two integers : " + dif);

        //product of two integers

        int product=numberOne*numberTwo;
        System.out.println("Product of two integers: "+product);

        //average of two integers

        int average=sum / 2;
        System.out.println("Average of two integers: "+average);

        //distance of two integers

        int distance=Math.abs(numberOne - numberTwo);
        System.out.println("Distance of two integers: "+distance);

        //maximum of two integers

        int max=Math.max(numberOne ,numberTwo);
        System.out.println("Max integer: "+max);

        //minimum of two integers

        int min=Math.min(numberOne ,numberTwo);
        System.out.println("min integer: "+min);

    }
}
