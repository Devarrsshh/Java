package com.company;

public class CWH_34_recursion {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
            }
        else{
            return n * factorial(n-1);
        }
    }
    static int factorial_interative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println("The factorial value of n is: " + factorial(n));
        System.out.println("The factorial value of n is: " + factorial_interative(n));
    }
}