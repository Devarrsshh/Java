package com.company;

class MyMainEmployee {
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 0;
        name = "Your-Name-Here";
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        this.name = n;
    }
    public int getId() {
        return id;
    }
    public void setId(int i) {
        this.id = i;
    }
}
public class cwh_42_constructors {
    public static void main(String[] args) {
          //MyEmployee devarsh = new MyEmployee();
         //devarsh.setName("Devarsh");
         //devarsh.setId(7);
        MyMainEmployee devarsh = new MyMainEmployee();
        System.out.println(devarsh.getId());
        System.out.println(devarsh.getName());
    }
}