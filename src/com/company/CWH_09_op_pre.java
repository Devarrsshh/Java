package com.company;

public class CWH_09_op_pre {
    public static void main(String[] args) {
        // Precedence & Associativity

        // int a = 6 * 5 - 34 / 2;
        // =30-34/2
        // =30-17
        // =13

        // int b = 60 / 5 - 34 * 2;
        // =12-34*2
        // =12-68
        // =-5
        // System.out.println(a);
        // System.out.println(b);

        // Quick quiz
        // int x = 6;
        // int y = 1;
        // int k = x * y / 2;
        // System.out.println(k);

        int b = 0;
        int c = 0;
        int a = 10;
        int k = b * b - (4 * a * c) / (2 * a);
        System.out.println(k);
    }
}