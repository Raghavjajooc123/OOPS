package com.oops.polymorphism;

public class Main {
    public static void main(String[] args) {
        student kunal = new student("Kunal", 12, 9.32f);
        kunal.printinfo("kunal");
        kunal.printinfo(12);
        kunal.printinfo(kunal);
    }
}
