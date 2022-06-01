package com.oops.introduction;

import com.oops.importedinintroduction.A;

public class Main {
    public static void main(String[] args) {
        Student mudit = new Student();
        System.out.println("Name is : " + mudit.name + " roll number is : " + mudit.roll + " CGPA is : " + mudit.cgpa);
        Student gunna = new Student(11, "gunna", 9.8f);
        System.out.println("Name is : " + gunna.name + " roll number is : " + gunna.roll + " CGPA is : " + gunna.cgpa);
        Student gunna1 = new Student(gunna);
        System.out.println("Name is : " + gunna1.name + " roll number is : " + gunna1.roll + " CGPA is : " + gunna1.cgpa);
        Student yashvi = new Student(19, "Yashvi", 9.1f);
        System.out.println("Name is : " + yashvi.name + " roll number is : " + yashvi.roll + " CGPA is : " + yashvi.cgpa);

        Student.hello();
        Student.noofstudents();

        yashvi.helloname();
        gunna1.helloname();

        mudit.changename("Mudit");
        System.out.println(mudit.name);

        //imported class
        A obj = new A(9);
        obj.printnum();

    }
}
