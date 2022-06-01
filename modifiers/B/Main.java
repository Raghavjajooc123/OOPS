package com.oops.modifiers.B;

import com.oops.modifiers.A.protector;

public class Main {
    public static void main(String[] args) {
        protector user2 = new protector("shradha", 17);
//        System.out.println(user2.roll);  ------ default cannot be accessed in different package
//        System.out.println(protector.key); ---- protected cannot be accessed without subclass

        B.displaykey();
    }

}
