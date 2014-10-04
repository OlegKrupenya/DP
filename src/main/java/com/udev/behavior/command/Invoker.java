package com.udev.behavior.command;

/**
 * Created by Taipan on 04.10.2014.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void invoke() {
        this.command.execute();
    }
}
