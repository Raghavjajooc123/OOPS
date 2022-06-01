package com.oops.modifiers.A;

public class protector {
    int roll;
    static protected int key = 1000;
    public String Username;
    private String Password;

    public protector(String username, int roll) {
        this.Username = username;
        this.roll = roll;
    }

    //getters and setters
    public void setPassword(String password) {
        this.Password = password;
    }
    public String getPassword() {
        return Password;
    }


}
