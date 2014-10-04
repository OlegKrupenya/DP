package com.udev.behavior.observer;

/**
 * Created by Taipan on 04.10.2014.
 */
public class Client {
    public static void main(String[] args) {
        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();
        Observable observable = new ConcreteObservable();
        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.notifyObservers();
    }
}
