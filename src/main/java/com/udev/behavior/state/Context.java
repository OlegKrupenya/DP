package com.udev.behavior.state;

/**
 * Created by Taipan on 05.10.2014.
 */
public class Context {
    private State state;

    public Context() {
        this.state = new ConcreteStateA();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request(String name) {
        this.state.handle(this,name);
    }
}
