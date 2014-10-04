package com.udev.behavior.mediator;

/**
 * Created by Taipan on 05.10.2014.
 */
public class Client {
    public static void main(String[] args) {
        Colleague c1 = new ConcreteColleagueA();
        Colleague c2 = new ConcreteColleagueB();
        Mediator mediator = new ConcreteMediator(c1, c2);
        c1.setMediator(mediator);
        c2.setMediator(mediator);
        c2.send("Test message from c2");
        c1.send("Reply from c1");
    }
}
