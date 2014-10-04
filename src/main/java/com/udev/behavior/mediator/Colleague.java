package com.udev.behavior.mediator;

/**
 * Created by Taipan on 05.10.2014.
 */
public interface Colleague {
    void notify(String msg);
    void send(String msg);
    void setMediator(Mediator mediator);
}
