package com.company;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();

      int compChoice = rand.nextInt(3); // taking computer input random
        System.out.println("0-->rock\n1-->paper\n2-->scissor");
        System.out.println("what do you choose");
        int user_choice = sc.nextInt();

        // game logic
        System.out.printf("You choose%d\n", user_choice);
        System.out.printf("computer choose%d\n", compChoice);

        if (compChoice == user_choice){
            System.out.println("Its a draw");
        } else if (compChoice == 0){
             if (user_choice == 1) {
                System.out.println("you won");
            } else if (user_choice == 2) {
                System.out.println("computer won");
            }
        } else if (compChoice == 1){
            if  (user_choice == 0){
                System.out.println("computer won");
            } else if (user_choice == 2){
                System.out.println("You won");
            }
        } else {
            if(user_choice == 0) {
                System.out.println("You won");
            } else if(user_choice == 1){
                System.out.println("computer won");
            }
        }
    }
}