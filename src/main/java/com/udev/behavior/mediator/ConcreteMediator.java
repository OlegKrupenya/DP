package com.udev.behavior.mediator;

/**
 * Created by Taipan on 05.10.2014.
 */
public class ConcreteMediator implements Mediator {

    private Colleague colleague1;
    private Colleague colleague2;

    public ConcreteMediator(Colleague colleague1, Colleague colleague2) {
        this.colleague1 = colleague1;
        this.colleague2 = colleague2;
    }

    @Override
    public void sendMessage(String msg, Colleague colleague) {
        if (colleague.equals(colleague1)) {
            colleague2.notify(msg);
        } else {
            colleague1.notify(msg);
        }
    }
}
