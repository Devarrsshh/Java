package com.company;
class Practice13 extends Thread{
    public void run() {
        while (true) {
            System.out.println("Good Morning!");
        }
    }
}
class Practice13b extends Thread{
    public void run() {
        while (true) {
            try {
            Thread.sleep(200);
            System.out.println("Welcome!");
        }
            catch(Exception e) {
                System.out.println(e);

            }
        }
    }
}
public class cwh_76_practice13 {
    public static void main(String[] args) {
        Practice13 p1 = new Practice13();
        Practice13b p2 = new Practice13b();
        p1.setPriority(6);
        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
//        p1.start();
        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
