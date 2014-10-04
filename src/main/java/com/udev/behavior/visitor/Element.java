package com.udev.behavior.visitor;

/**
 * Created by Taipan on 04.10.2014.
 */
public interface Element {
    void setState();
    void visit(Visitor visitor);
}
