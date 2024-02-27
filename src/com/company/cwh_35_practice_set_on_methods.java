package com.company;
import java.util.Scanner;

public class cwh_35_practice_set_on_methods {
    // 1
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }

    // 2
    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 3
    static void pattern1_rec(int n) {
        if (n > 0) {
            pattern1_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // pattern1_rec(3)
    // pattern1_rec(2) + 3 times star and new line
    // pattern1_rec(1) + 2 times star and new line + 3 times star and new line
    // pattern1_rec(0) + 1 times star and new line + 2 times star and new line + 3 times star and new line

    // 5
    // sum(n) = 1 + 2 + 3... + n
    // sum(n) = 1 + 2 + 3... + n-1 + n
    // sum(n) = sum(n-1) + n
    // sum(3) = 3 + sum(2)
    // sum(3) = 3 + 2 + sum(1)
    // sum(3) = 3 + 2 + 1
    static int sumRec(int n) {
        // Base condition
        if (n == 1) {
            return 1;
        }
        return n + sumRec(n - 1);
    }
    static int fib(int n) {
        /* if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        } */
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    // 6
    static int add(int ...arr){
        int result = 0;
        int b = arr.length;
        for(int a: arr){
            result += a;
        }
        return result/ arr.length;
    }

    // 7
    static void pattern2(int n) {
        if (n>0){
            pattern2(n-1);
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
           }
        }
    }

    // 8

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the celsius temp here: ");
    double c = sc.nextDouble();

    double f = (c * 9/5) + 32;
    System.out.println(c + " celsius to temp is: " + f);
}


        // Problem 1
        // multiplication(7);

        // Problem 2
        // pattern1(9);

        // Problem 3
        // int c = sumRec(4);
        // System.out.println(c);

        // Problem 5
        // fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        // int result = fib(7);
        // System.out.println(result);

        // problem 6
        //System.out.println(add(2,5));
        //System.out.println(add(3,7));

        // problem 7
        //pattern2(4);

        // Problem 8
        //pattern1(9);

    }
//

