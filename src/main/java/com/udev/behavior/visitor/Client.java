package com.udev.behavior.visitor;

/**
 * Created by Taipan on 04.10.2014.
 */
public class Client {
    public static void main(String[] args) {
        Element element = new ConcreteElement1();
        Element element1 = new ConcreteElement2();
        Visitor visitor = new ConcreteVisitor1();
        visitor.accept(element);
        visitor.accept(element1);
    }
}
