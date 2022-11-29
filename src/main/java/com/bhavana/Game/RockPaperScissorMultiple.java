package com.bhavana.Game;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorMultiple {

    public static void main(String[] args) {
        int userChoice, computerChoice, rock, paper, scissors;
        Scanner sc = new Scanner(System.in);
        int number = (int) ((Math.random() * (100 - 1)) + 1);
        int k = 5;
        int i;
        for (i = 0; i < k; i++) {
            System.out.println("try again the number");
            userChoice = sc.nextInt();
            if (number == userChoice) {
                System.out.println("congrats you have guessed the correct number");
                break;
            }
            Random rnd = new Random();
            rock = 0;
            paper = 1;
            scissors = 2;

            System.out.println("ROCK - PAPER - SCISSORRS GAME");
            System.out.println("Enter your choice (0=rock, 1=paper, 2=scissors)");
            userChoice = sc.nextInt();
            while (userChoice > 2) {
                System.out.println("give number between 0 and 2");
                userChoice = sc.nextInt();
            }
            if (userChoice == rock) {
                System.out.println("User chose ROCK");
            } else {
                if (userChoice == paper) {
                    System.out.println("User chose PAPER");
                } else {
                    System.out.println("User chose SCISSORS");
                }
            }
            computerChoice = rnd.nextInt(3);

            if (computerChoice == rock) {
                System.out.println("Computer chose ROCK");
            } else {
                if (computerChoice == paper) {
                    System.out.println("Computer chose PAPER");
                } else {
                    System.out.println("Computer chose SCISSORS");
                }
            }

            while (userChoice == computerChoice) {
                System.out.println("draw try again");

                userChoice = sc.nextInt();
                while (userChoice > 2) {
                    System.out.println("give number between 0 and 2");
                    userChoice = sc.nextInt();
                }
                computerChoice = rnd.nextInt(3);
                if (userChoice == rock) {
                    System.out.println("User chose ROCK");
                } else {
                    if (userChoice == paper) {
                        System.out.println("User chose PAPER");
                    } else {
                        System.out.println("User chose SCISSORS");
                    }
                }
                if (computerChoice == rock) {
                    System.out.println("Computer chose ROCK");
                } else {
                    if (computerChoice == paper) {
                        System.out.println("Computer chose PAPER");
                    } else {
                        System.out.println("Computer chose SCISSORS");
                    }
                }
            }
            if (computerChoice == rock) {
                if (userChoice == paper) {
                    System.out.println("User wins!");
                } else {
                    System.out.println("Computer Wins");
                }
            } else if (computerChoice == paper) {
                if (userChoice == rock) {
                    System.out.println("Computer wins");
                } else {
                    System.out.println("User Wins!");
                }
            } else if (userChoice == rock) {
                System.out.println("User Wins");
            } else {
                System.out.println("Computer Wins");
            }
        }
    }
}
