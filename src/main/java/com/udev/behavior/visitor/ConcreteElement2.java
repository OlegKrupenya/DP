package com.udev.behavior.visitor;

/**
 * Created by Taipan on 04.10.2014.
 */
public class ConcreteElement2 implements Element {

    @Override
    public void setState() {

    }

    @Override
    public void visit(Visitor visitor) {
        visitor.accept(this);
    }
}
