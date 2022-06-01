package com.oops.objectclass;

public class Objectclasss {
    int num;

    public Objectclasss(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return this.num;
    }

    @Override
    public String toString() {
        return  getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object deleted");
    }
}
