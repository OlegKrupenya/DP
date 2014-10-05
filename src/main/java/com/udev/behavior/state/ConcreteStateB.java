package com.udev.behavior.state;

/**
 * Created by Taipan on 05.10.2014.
 */
public class ConcreteStateB implements State {
    @Override
    public void handle(Context context, String name) {
        System.out.println(name.toUpperCase());
        context.setState(new ConcreteStateA());
    }
}
