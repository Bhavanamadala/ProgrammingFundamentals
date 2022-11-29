package com.bhavana.Game;

import java.util.Scanner;

public class GuessNumber {

        int number;

        public static void main(String[] args) {

            System.out.println("Hello,welcome to the number guessing game");
            Scanner scanner = new Scanner(System.in);

//        System.out.println("please provide the number");
//        int number=scanner.nextInt();

            // Generate a random
            int number = (int) ((Math.random() * (100 - 1)) + 1);

            int guess;
            System.out.println("a number is choosen between 1 to 100. " + "guess the number " + " within one trial");
            System.out.println("guess the number:");
            guess = scanner.nextInt();

            if (number < guess) {
                System.out.println("too high");
            } else if (number > guess) {
                System.out.println("too low");
            } else if (number == guess) {
                System.out.println(" Congratulations! You guessed the number");
            }
            System.out.println("the number was:" + number);

        }

    }

