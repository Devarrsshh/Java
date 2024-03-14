package com.company;
abstract class Parent2{
    public Parent2(){
        System.out.println("This is an parent2 constructor");
    }
    public void sayHello(){
        System.out.println("hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child2 extends Parent2{
    public void greet(){
        System.out.println("Good morning");
    }
    public void greet2(){
        System.out.println("Good afternoon");
    }
}
abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("i am good");
    }
}
public class cwh_53_abstract {
    public static void main(String[] args) {
        //Parent2 p = new Parent2(); --error
        Child2 c = new Child2();
        //Child3 c3 = new Child3(); --error
    }
}
