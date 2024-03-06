package com.company;
class base1{
    base1 (){
        System.out.println("I am a base constructor");
    }
    base1(int x){
        System.out.println("This is an overloaded constructors " + x);
    }
}
class derived1 extends base1{
    derived1() {
        //super(0);
        System.out.println("I am a derived constructor");
    }
    derived1(int x ,int y){
        super(x);
        System.out.println("I am an overloaded constructor " + y);
    }
}
class childOfDerived extends derived1{
    childOfDerived(){
        System.out.println("I am child of derived constructor");
    }
    childOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor od derived with value os z as " + z);
    }
}
public class cwh_46_constructors_in_inheritance {
    public static void main(String[] args) {
        //base1 b = new base1();
        //derived1 d =new derived1();
        //derived1 d = new derived1(12, 11);
        childOfDerived c = new childOfDerived(4,5,6);
    }
}