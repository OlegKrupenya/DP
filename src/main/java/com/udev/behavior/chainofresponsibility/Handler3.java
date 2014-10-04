package com.udev.behavior.chainofresponsibility;

/**
 * Created by Taipan on 04.10.2014.
 */
public class Handler3 implements Handler {

    private Handler nextHandler;

    @Override
    public void process(String message, int type) {
        if (type == 3) {
            System.out.println("processed" + message + " in Handler 3");
        } else {
            nextHandler.process(message, type);
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
