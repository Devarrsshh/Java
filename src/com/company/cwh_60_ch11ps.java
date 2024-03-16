package com.company;
abstract class pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends pen{
    void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("changing the nib");
    }
}
class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello sir!");
    }
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
}
abstract class telephone{
    abstract void lift();
    abstract void disconnected();
}
class smartTelephone extends telephone{
    void lift(){
        System.out.println("lifting the receiver of a smart telephone");
    }
    void disconnected(){
        System.out.println("Telephone is disconnected");
    }
}
interface TVRemote{
    void powerOn();
    void powerOff();
    void changeChannel(int channel);
}
interface SmartTVRemote extends TVRemote{
    void navigateInternet();
    void useApps();
}
class TV implements TVRemote{
    boolean isOn;
    int currentChannel;

    public TV(){
        this.isOn = false;
        this.currentChannel = 0;
    }
    public void powerOn(){
        System.out.println("TV is on");
        isOn = true;
    }
    public void powerOff(){
        System.out.println("TV is off");
        isOn = false;
    }
    public void changeChannel(int Channel){
        if(isOn) {
            currentChannel = Channel;
            System.out.println("Channel changed to " + Channel);
        } else {
            System.out.println("TV is not powered on");
        }
    }
}

public class cwh_60_ch11ps {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.changeNib();

        human devarsh = new human();
        devarsh.sleep();

        Monkey m1 = new human();
        m1.jump();
        m1.bite();
        //m1.speak();  --> Cannot use speak method because the reference is monkey which does not have speak method

        BasicAnimal lovish = new human();
        lovish.eat();
        lovish.sleep();
        //lovish.speak(); --> error

        telephone tel = new smartTelephone();
        tel.lift();
        tel.disconnected();

        TV tv = new TV();

        tv.powerOn();
        tv.changeChannel(5);
        //tv.powerOff();
        tv.powerOff();
    }
}
