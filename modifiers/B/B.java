package com.oops.modifiers.B;

import com.oops.modifiers.A.protector;

public class B extends protector {
    int num;

    public static void displaykey(){
        System.out.println(key);//we can access the protected specifier here
    }

    public B(String username, int roll, int num) {
        super(username, roll);
        this.num = num;
    }
}
