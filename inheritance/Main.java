package com.oops.inheritance;

public class Main {
    public static void main(String[] args) {
        shapes shape1 = new shapes();
        shapes shape2 = new shapes("Triangle", 3);

        System.out.println("The shape "+shape1.name+" having "+shape1.sides+" sides.");
        shape2.printshape();
        shape2.printarea();
        shapes.greeting();
        square.greeting();

        square square1 = new square("square1", 4, 3);
        square1.printshape();
        square1.printarea();

        circle circle1 = new circle("circle1", 0, 5);
        circle1.printshape();
        circle1.printarea();

        circle circle2 = new circle(2);
        circle2.printshape();
        circle2.printarea();

        shapes square2 = new square("square2", 4, 6);
        square2.printarea();
    }
}
