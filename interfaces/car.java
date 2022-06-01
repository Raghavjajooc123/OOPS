package com.oops.interfaces;

public class car implements engine, brake, mediaplayer{
    String carname;

    car(String carname){
        this.carname = carname;
    }
    car(){
        this.carname = "BMW";
    }

    @Override
    public void apply() {
        System.out.println("Apply the brakes of " + this.carname);
    }

    @Override
    public void release() {
        System.out.println("Release the brakes of " + this.carname);
    }

    @Override
    public void start() {
        System.out.println("starts the engine of " + this.carname);
    }

    @Override
    public void pause() {
        System.out.println("Pauses the mediaplayer of " + this.carname);
    }

    @Override
    public void stop() {
        System.out.println("Stops the engine of " + this.carname);
    }
}
