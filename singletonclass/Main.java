package com.oops.singletonclass;

public class Main {
    public static void main(String[]args){
        singleton instance = singleton.getinstance("Raghav", 12);
        singleton instance2 = singleton.getinstance("Shradha", 13);
        System.out.println(instance.num);
        System.out.println(instance2.num);//it can only give one object
    }
}