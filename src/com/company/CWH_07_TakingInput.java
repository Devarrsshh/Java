package com.company;

import java.util.Scanner;

public class CWH_07_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input fromt the user");
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter number 1");
         //int a = sc.nextInt();
         //float a = sc.nextFloat();

         System.out.println("Enter number 2");
         //float b = sc.nextFloat();
         //int b = sc.nextInt();

         //int sum = a + b;
         //float sum = a + b;

         //System.out.print("The sum of these number is: ");
         //System.out.println(sum);

         // boolean b1 = sc.hasNextInt();
         // System.out.println(b1);
        String str = sc.nextLine();
        System.out.println(str);
    }
}
