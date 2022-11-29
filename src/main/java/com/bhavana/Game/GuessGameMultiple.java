package com.bhavana.Game;

import java.util.Scanner;

public class GuessGameMultiple {
    public static void main(String[] args) {

        int k = 5;
        int i, guess;
        Scanner sc = new Scanner(System.in);
        int number = (int) ((Math.random() * (100 - 1)) + 1);

        System.out.println("A number is chosen" + " between 1 to 100." + "Guess the number" + " within 5 trials.");

        for(i=0;i<=5;i++){
            System.out.println("guess the number:");
            guess=sc.nextInt();

            if (number<guess) {
                System.out.println("too high");
            } else if(number>guess){
                System.out.println("too low");
            } else if (number==guess) {
                System.out.println(" Congratulations! You guessed the number");
                break;
            }
            if (i == k) {
                System.out.println(
                        "You have exhausted"
                                + " k trials.");

                System.out.println(
                        "The number was " + number);
            }
        }

    }
}
