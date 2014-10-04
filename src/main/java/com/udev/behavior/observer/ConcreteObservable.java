package com.udev.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Taipan on 04.10.2014.
 */
public class ConcreteObservable implements Observable {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        this.observers.stream().forEach((Observer o) -> o.handlerEvent());
    }
}
