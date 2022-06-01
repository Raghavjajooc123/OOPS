package com.oops.abstractclasses;

public class engineer extends careers{
    static String profession = "engineering";
    int exp;

    public engineer(int exp) {
        this.exp = exp;
    }
    engineer(){
        this.exp = 0;
    }

    @Override
    void printcareer() {
        System.out.println("Welcome!! "+ engineer.profession +" having "+this.exp+" work experience.");
    }

    @Override
    void careername() {
        System.out.println("Hey its an engineer");
    }
}
