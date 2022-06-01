package com.oops.singletonclass;

public class singleton {
    private String password;
    public int num;

    //private constructor
    private singleton(String Password, int num){
        this.password = Password;
        this.num = num;
    }

    private static singleton instance;
    public static singleton getinstance(String Password, int num){
        if(instance == null){
            instance = new singleton(Password, num);
        }
        return instance;
    }


}
