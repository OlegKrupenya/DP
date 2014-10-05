package com.udev.behavior.memento;

/**
 * Created by Taipan on 05.10.2014.
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
