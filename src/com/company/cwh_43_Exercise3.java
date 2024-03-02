package com.company;

import java.util.Scanner;
import java.util.Random;

class NumberGuessingGame {
    private int randomNumber;
    private int userInput;
    private int noOfguesses;

    public NumberGuessingGame() {
        generateRandomNumber();
        takeUserInput ();
        noOfguesses = 0;
    }
    public void generateRandomNumber() {
        Random random = new Random();
        randomNumber = random.nextInt(10)+1;
    }
    public void takeUserInput (){
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextInt();
        noOfguesses++;
        System.out.println(noOfguesses);
    }
    public boolean isCorrectNumber() {
        return randomNumber == userInput;
    }
    public int getNoOfguesses(){
        return noOfguesses;
    }
}
    public class cwh_43_Exercise3 {
        public static void main(String[] args) {
            NumberGuessingGame game = new NumberGuessingGame();
            while (!game.isCorrectNumber()) {
                game.takeUserInput();

                if (game.isCorrectNumber()) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    System.out.println("Number of guesses: " + game.getNoOfguesses());
                } else {
                    System.out.println("Try again! Incorrect guess.");
                }
            }
        }
    }
