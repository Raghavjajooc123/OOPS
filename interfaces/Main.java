package com.oops.interfaces;

public class Main {
    public static void main(String[] args) {
        car maruti = new car("maruti");
        maruti.start();
        maruti.apply();
        maruti.pause();
        maruti.release();
        maruti.stop();
    }
}
