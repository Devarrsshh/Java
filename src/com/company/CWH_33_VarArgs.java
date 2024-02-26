package com.company;

public class CWH_33_VarArgs {
    static int add(int ...arr){
        int result = 0;
        for(int a: arr){
             result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(add(2,5));
        System.out.println(add(3,7));
    }
}