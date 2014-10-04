package com.udev.behavior.observer;

import java.util.List;

/**
 * Created by Taipan on 04.10.2014.
 */
public interface Observable {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
