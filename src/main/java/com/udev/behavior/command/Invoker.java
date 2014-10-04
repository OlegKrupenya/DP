package com.udev.behavior.command;

/**
 * Created by Taipan on 04.10.2014.
 */
public class Invoker {
    private Command command1;
    private Command command2;

    public Invoker(Command command1, Command command2) {
        this.command1 = command1;
        this.command2 = command2;
    }

    public void invoke1() {
        this.command1.execute();
    }
    public void invoke2() {
        this.command2.execute();
    }
}
