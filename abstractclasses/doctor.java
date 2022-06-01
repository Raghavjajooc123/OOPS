package com.oops.abstractclasses;

public class doctor extends careers{
    static String profession = "doctor";
    int exp;

    public doctor(int exp) {
        this.exp = exp;
    }
    doctor(){
        this.exp = 0;
    }

    @Override
    void printcareer() {
        System.out.println("Welcome!! "+doctor.profession +" having "+this.exp+" years work experience.");
    }

    @Override
    void careername() {
        System.out.println("Hey its a doctor");
    }
}