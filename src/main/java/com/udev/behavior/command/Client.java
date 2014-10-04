package com.udev.behavior.command;

/**
 * Created by Taipan on 04.10.2014.
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.invoke();
    }
}
