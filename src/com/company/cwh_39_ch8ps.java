package com.company;

// 1
class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

// 2
class cellPhone{
    public void ring(){
        System.out.println("Ringing....");
        }
        public void vibrate(){
        System.out.println("Vibrating...");
        }
        public void call(){
            System.out.println("Calling Mukesh");
        }
    }

// 3
class square{
    int side;
    public int area(){
        return side * side;
    }
    public int parameter(){
        return 4*side;
    }
}

// 4
class rectangle{
    int length;
    //int breath;
    int width;
    public int area(){
        return length * width;
    }
    public int parameter(){
        return 2 * (length + width);
    }
}

// 5
class tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

// 6
class circle{
    /*int length;
    //int breath;
    int width;*/
    int radius;
    public double area(){
        return Math.PI * radius * radius;
    }
    public double parameter(){
        return 2 * Math.PI * radius;
    }
}

public class cwh_39_ch8ps {
    public static void main(String[] args) {

        // Problem 1
        /*Employee harry = new Employee();
        harry.setName("CodeWithHarry");
        harry.salary = 233;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());*/

        // Problem 2
        /*cellPhone asus = new cellPhone();
        asus.call();
        asus.vibrate();
        asus.ring();*/

        // Problem 3
        /*square sq = new square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.parameter());*/

        // problem 4
        /* rectangle rec = new rectangle();
        rec.length = 4;
        rec.width = 5;
        System.out.println(rec.area());
        System.out.println(rec.parameter()); */

        // problem 5
        /*tommy player1 = new tommy();
        player1.fire();
        player1.hit();
        player1.run();*/

        // problem 6
        circle ci = new circle();
        ci.radius = 5;
        System.out.println(ci.area());
        System.out.println(ci.parameter());
    }
}