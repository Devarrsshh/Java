package com.company;

class MyEmployee {
    private int id;
    private String name;

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
public class cwh_40_ch9 {
    public static void main(String[] args) {
        MyEmployee devarsh = new MyEmployee();
        devarsh.setName("Devarsh");
        System.out.println(devarsh.getName());
        devarsh.setId(7);
        System.out.println(devarsh.getId());
    }
}