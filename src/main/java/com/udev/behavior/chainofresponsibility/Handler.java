package com.udev.behavior.chainofresponsibility;

/**
 * Created by Taipan on 04.10.2014.
 */
public interface Handler {
    void process(String message, int type);
    void setNextHandler(Handler nextHandler);

}
