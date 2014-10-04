package com.udev.behavior.observer;

/**
 * Created by Taipan on 04.10.2014.
 */
public class ConcreteObserver2 implements Observer {
    @Override
    public void handlerEvent() {
        System.out.println("notified 2");
    }
}
