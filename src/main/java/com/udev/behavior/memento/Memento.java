package com.udev.behavior.memento;

/**
 * Created by Taipan on 05.10.2014.
 */
public class Memento {
    public Memento() {
    }

    public Memento(String state) {
        this.state = state;
    }

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
