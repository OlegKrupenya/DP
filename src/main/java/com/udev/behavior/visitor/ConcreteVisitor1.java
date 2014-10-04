package com.udev.behavior.visitor;

/**
 * Created by Taipan on 04.10.2014.
 */
public class ConcreteVisitor1 implements Visitor {
    @Override
    public void accept(Element element) {
        element.setState();
        System.out.println("state has been changed for " + element.getClass().getName());
    }
}
