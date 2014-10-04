package com.udev.behavior.templatemethod;

/**
 * Created by Taipan on 04.10.2014.
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass abstractClass1 = new ConcreteClass1();
        AbstractClass abstractClass2 = new ConcreteClass2();
        abstractClass1.templateMethod();
        abstractClass2.templateMethod();
    }
}
