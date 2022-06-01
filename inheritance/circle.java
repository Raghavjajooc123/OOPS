package com.oops.inheritance;

public class circle extends shapes{
    int radius;

    //methods
    public void printarea(){
        System.out.println("Area is "+3.14*radius*radius);
    }

    //constructors
    public circle(String name, int sides, int radius) {
        super(name, sides);
        this.radius = radius;
    }
    public circle(int radius) {
        super();
        this.radius = radius;
    }
}
