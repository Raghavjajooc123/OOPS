package com.oops.introduction;

public class Student {
    int roll;
    String name;
    float cgpa;

    //using a static block to initialize static variables
    static int a = 5;
    static int b;
    static{
        b = a*4;
    }

    static int totalstudents = 0;

    //methods
    public void helloname(){
        System.out.println("Hello!!! I am "+this.name);
    }
    public void changename(String name){
        this.name = name;
    }
    //static method - depends on the classname
    static void hello(){
        System.out.println("Hello!!");
    }
    static void noofstudents(){
        System.out.println("Total number of Students are : " + Student.totalstudents);
    }

    //creating constructors
    public Student(){
        this.roll = -1;
        this.name = null;
        this.cgpa = -1;
//        this(-1, null, -1f);
        Student.totalstudents++;
    }
    public Student(int roll, String name, float cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
        Student.totalstudents++;
    }
    public Student(Student other) {
        this.roll = other.roll;
        this.name = other.name;
        this.cgpa = other.cgpa;
//        this(other.roll, other.name, other.cgpa);
        Student.totalstudents++;
    }

//    garbage collector
//    @Override
//    protected void finalsize() throws Throwable {
//        super.finalize();
//        System.out.println("Garbage!!");
//    }
}
