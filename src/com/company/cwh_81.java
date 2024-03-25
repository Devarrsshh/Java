package com.company;

import java.util.Scanner;

public class cwh_81 {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks [0] = 7;
        marks [1] = 56;
        marks [2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array index");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide with");
        int number = sc.nextInt();
        try {
            System.out.println("the value of the array index entered is: " + marks[ind]);
            System.out.println(("the value of the array value/number is: " + marks[ind]/number));
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occured");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("some exception occured");
            System.out.println(e);
        }
    }
}
