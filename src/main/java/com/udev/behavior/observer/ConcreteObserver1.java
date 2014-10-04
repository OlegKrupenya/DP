package com.udev.behavior.observer;

/**
 * Created by Taipan on 04.10.2014.
 */
public class ConcreteObserver1 implements Observer {
    @Override
    public void handlerEvent() {
        System.out.println("notified 1");
    }
}
