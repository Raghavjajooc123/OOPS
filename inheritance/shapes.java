package com.oops.inheritance;

public class shapes {
    String name;
    int sides;

    static void greeting(){
        System.out.println("Hello there!!!");
    }
    void printshape(){
        System.out.println("Hey I am a "+this.name+" having "+this.sides+" sides.");
    }

    //we do polymorphism in this as we do function overriding
    public void printarea(){
        System.out.println("This prints area of the shape");
    }

    public shapes(String name, int sides) {
        this.name = name;
        this.sides = sides;
    }

    public shapes() {
        this.name = "shape";
        this.sides = 0;
    }
}
