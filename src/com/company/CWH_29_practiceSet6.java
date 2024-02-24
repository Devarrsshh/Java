package com.company;

public class CWH_29_practiceSet6 {
    public static void main(String[] args) {
        // Practice problem 1
        /*float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is: " + sum);*/

        // Practice problem 2
      /* float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
       float num=45.5f;
       boolean IsInArray=false;
       for(float element:marks){
           if(num==element){
               IsInArray = true;
               System.out.println("The value is present in the array");
               break;
           }
       }
           if(IsInArray){
               System.out.println("The value is present in the array");
       }
           else{
               System.out.println("The value is not present in the array");
       }*/

        // Practice problem 3
        /*float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is: " + sum/marks.length);*/

        // Practice problem 4
       /* int[][] mat1 = {{1, 2, 3},
                        {4, 5, 6}};
        int[][] mat2 = {{2, 6, 13},
                        {3, 7, 1}};
        int[][] result = {{0, 0, 0},
                          {0, 0, 0}};

        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[i].length; j++){
               System.out.printf("Setting value for i=%d and j=%d\n", i, j);
            }
        }
         //Printing the elements of a 2-D Array
        for (int i=0;i<mat1.length;i++) { // row number of times
            for (int j = 0; j < mat1[i].length; j++) { // column number of time
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println(""); // Prints a new line
        }*/

        // Practice problem 5
        /*int [] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for(int i=0; i<n; i++) {
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for (int element: arr){
            System.out.print(element + " ");
        }*/

        // Practice problem 6
        /*int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        int min = 0;
        for(int element: arr){
            if(element>min){
                min = element;
            }
        }
        System.out.println(min);*/

        // practice problem 7
        //System.out.println(Integer.MIN_VALUE); - This is the code to check the minimum integer value
        //System.out.println(Integer.MAX_VALUE); - This is the code to check the maximum integer value
        /*int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        int min = 2147483647;
        for(int element: arr){
            if(element<min){
                min = element;
            }
        }
        System.out.println(min);*/

        // practice problem 8
        boolean isSorted = true;
        int [] arr = {1, 5, 7, 9, 11, 34, 67};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        }
        else {
            System.out.println("The array is not sorted");
        }
    }
}