package com.company;


    class base {
        int x;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            System.out.println("I am in base setting x now");
            this.x = x;
        }
    }
    class derived extends base{
        public int y;

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
public class cwh_45_inheritance {
    public static void main(String[] args) {
        base b = new base();
        b.setX(4);
        System.out.println(b.getX());

        // creating an object of derived class
        derived d = new derived();
        d.setY(7);
        System.out.println(d.getY());
    }
}
