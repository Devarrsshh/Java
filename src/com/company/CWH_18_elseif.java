package com.company;
import java.util.Scanner;

public class CWH_18_elseif {
    public static void main(String[] args) {
        int age;
        System.out.println("Please enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        //  SWITCH
        switch (age) {
            case 18:
                System.out.println("You are going to become an adult");
                break;
            case 23:
                System.out.println("You are going to join a job");
                break;
            case 60:
                System.out.println("You are going to retire");
                break;
            default:
                System.out.println("Enjoy your life");
                break;
        }
        System.out.println("Thanks for using my code");

        // IF ELSE
      /*  if (age>56){
            System.out.println("You are experienced!");
        }
        else if(age>46){
            System.out.println("You are semi-experienced!");
        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced!");
        }
        else{
            System.out.println("You are not experienced");
        }*/
    }
}