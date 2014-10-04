package com.udev.behavior.mediator;

/**
 * Created by Taipan on 05.10.2014.
 */
public class ConcreteColleagueB implements Colleague {
    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    @Override
    public void notify(String msg) {
        System.out.println("ConcreteColleagueB: " + msg);
    }

    @Override
    public void send(String msg) {
        mediator.sendMessage(msg,this);
    }
}
