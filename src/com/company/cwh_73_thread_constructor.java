package com.company;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 61;
        System.out.println("i am happy");
    }
}
public class cwh_73_thread_constructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Devarsh");
        MyThr t2 = new MyThr("Harry");
        t1.start();
        t2.start();
        System.out.println("the id of the thread is " + t1.getId());
        System.out.println("the name of the thread is " + t1.getName());
        System.out.println("the id of the thread2 is " + t2.getId());
        System.out.println("the name of the thread2 is " + t2.getName());
    }
}
