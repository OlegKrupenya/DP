package com.udev.behavior.command;

/**
 * Created by Taipan on 04.10.2014.
 */
public class ConcreteCommand2 implements Command {
    private Receiver receiver;

    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("Command execute 2");
        receiver.action1();
    }
}
