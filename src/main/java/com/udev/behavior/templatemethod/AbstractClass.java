package com.udev.behavior.templatemethod;

/**
 * Created by Taipan on 04.10.2014.
 */
public abstract class AbstractClass {
    public void templateMethod() {
        m1();
        a1();
        a2();
        m2();
    }
    public void m1() {
        System.out.println("m1 parent");
    }
    public void m2() {
        System.out.println("m2 parent");
    }
    abstract public void a1();
    abstract public void a2();
}
