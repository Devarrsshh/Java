package com.company;

class A{
    public int a;
    public int harry (){
        return 4;
    }
    public void meth2(){
        System.out.println("i am method 2 of class A");
    }
}
class b extends A{
    public void meth2(){
        System.out.println("i am method 2 of class b");
    }
    public void meth3 (){
        System.out.println("i am method 3 of class b");
    }
}
public class cwh_48_method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        b B = new b();
        B.meth2();
    }
}
