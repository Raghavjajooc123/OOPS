package com.oops.modifiers.A;

public class Main {
    public static void main(String[] args) {
        protector user = new protector("raghav", 14);
        user.setPassword("Raghavjajoo");
        System.out.println(user.getPassword());
    }
}
