package com.company;

import java.awt.geom.Area;

class Circle {

    public int radius;

    Circle() {
        System.out.println("I am non param of circle");
    }

    Circle(int r) {
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder1 extends Circle {
    public int height;

    Cylinder1(int r, int h) {
        super(r);
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

class Rectangle1 {
    public int length;
    public int width;

    public Rectangle1(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double CalculateArea(){
        return this.length * this.width;
    }
}

class Cuboid extends Rectangle1 {
    public int height;

    public Cuboid(int length, int width, int heigth) {
        super(length, width);
        this.height= heigth;
     }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    double volume(){
        return this.length * this.width * this.height;
    }
}

public class cwh_52_ch10ps {
    public static void main(String[] args) {
        Rectangle1 rec = new Rectangle1(8, 5);
        Cuboid cub = new Cuboid(3, 4, 6);
        System.out.println("Area of rectangle is " + rec.CalculateArea());
       // System.out.println("Volume of rectangle is ");
        System.out.println("Area of cuboid is " + cub.CalculateArea());
        System.out.println("Volume of cuboid is " + cub.volume());
    }
}
