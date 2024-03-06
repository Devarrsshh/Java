package com.company;
class phone {
    public void showtime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on phone....");
    }
}

class smartphone extends phone{
    public void music(){
        System.out.println("Playing music");
    }
    public void on(){
        System.out.println("Turning on smartphone...");
    }
}
public class cwh_49_dynamic_method_dispatch {
    public static void main(String[] args) {
        phone obj = new phone();
        smartphone sp = new smartphone();

        //obj = new smartphone(); // allowed
        // sp = new phone(); // not allowed

        //obj.on(); // allowed
        //obj.showtime(); // allowed
        //obj.music(); // not allowed
    }
}
