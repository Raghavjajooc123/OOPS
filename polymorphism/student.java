package com.oops.polymorphism;

public class student {
    String name;
    int roll;
    float cg;

    public student(String name, int roll, float cg) {
        this.name = name;
        this.roll = roll;
        this.cg = cg;
    }

    //making multiple functions with same name - function overloading
    void printinfo(student obj){
        System.out.println("name : "+obj.name+" Roll No. : "+obj.roll+" CGPA : "+obj.cg);
    }
    void printinfo(String name){
        System.out.println("The name is "+name);
    }
    void printinfo(int roll){
        System.out.println("Roll no. is "+ roll);
    }
}
