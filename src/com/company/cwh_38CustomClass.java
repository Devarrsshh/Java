package com.company;

class employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is: " + id);
        System.out.println("My name is: " + name);
    }
    public int getSalary(){
        return salary;
    }
}

public class cwh_38CustomClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        employee harry = new employee();
        employee devarsh = new employee();

        // setting attributes for harry
        harry.id = 12;
        harry.salary = 34;
        harry.name = "Harry";

        // Setting attributes for Devarsh
        devarsh.id = 14;
        devarsh.salary = 34;
        devarsh.name = "Devarsh";

        harry.printDetails();
        devarsh.printDetails();
        int salary = harry.getSalary();
        System.out.println("My salary is " + salary);
    }
}
