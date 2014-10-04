package com.udev.behavior.command;

/**
 * Created by Taipan on 04.10.2014.
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command1 = new ConcreteCommand1(receiver);
        Command command2 = new ConcreteCommand2(receiver);
        Invoker invoker = new Invoker(command1, command2);
        invoker.invoke1();
        invoker.invoke2();
    }
}
