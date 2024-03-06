package com.company;
import javax.print.Doc;
class oneclass {
    int a;
    public int getA() {
        return a;
    }
    oneclass(int a){
        this.a =a;
    }
    public int returnone(){
        return 1;
    }
}
class Doclass extends oneclass{
    Doclass(int c){
        super(c);
        System.out.println("this is a constructor");
    }
}
public class cwh_47_ThisAndSuper {
    public static void main(String[] args) {
        oneclass o = new oneclass(65);
        Doclass d = new Doclass(45);
        System.out.println(d.getA());
    }
}
