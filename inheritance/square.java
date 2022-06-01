package com.oops.inheritance;

public class square extends shapes{
    int length;

    //methods
    public void printarea(){
        System.out.println("Area is "+length*length);
    }

    //constructors
    public square(String name, int sides, int length) {
        super(name, sides);
        this.length = length;
    }
}
