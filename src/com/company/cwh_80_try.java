package com.company;

public class cwh_80_try {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        //int c = a/b;
        try {
            int c = a/b;
            System.out.println("The result is: " + c);
        }
        catch(Exception e){
            System.out.print("We failed to divide. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
