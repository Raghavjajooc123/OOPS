package com.oops.abstractclasses;

public class Main {
    public static void main(String[] args) {
//        careers obj = new careers(); === will give an erroe because we cannot create an object of abstract class
        engineer boy1 = new engineer();
        boy1.printcareer();
        boy1.careername();

        doctor boy2 = new doctor(4);
        boy2.printcareer();
        boy2.careername();
    }
}
