package com.company;

public class CWH_27_arrays {
    public static void main(String[] args) {
       /* float [] marks = {98.5f, 45.5f, 79.5f, 99.5f, 80.5f} ;
        String [] students = {"Devarsh", "Yug", "Meet", "Jenith", "Harry"};
        System.out.println(students.length);
        System.out.println(students[3]); */

        int [] marks = {98, 45, 79, 99, 80};
        //System.out.println(marks.length);

        // Displaying the arrays (Naive method)
        System.out.println("Printing using naive method");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Displaying the arrays (for loop)
        System.out.println("Printing using for loop");
        for(int i=0; i<marks.length; i++) {
            System.out.println(marks[i]);
        }
        // Quick quiz: displaying the array in reverse order(for loop)
        System.out.println("Printing using for loop (Reverse order)");
        for(int i=marks.length-1; i>=0; i--) {
            System.out.println(marks[i]);
            }
        // Quick quiz: displaying the array in for-each loop
        System.out.println("Printing using for-each loop");
        for(int element: marks){
            System.out.println(element);
        }
    }
}