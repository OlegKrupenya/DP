package com.udev.behavior.mediator;

/**
 * Created by Taipan on 05.10.2014.
 */
public interface Mediator {
    void sendMessage(String msg, Colleague colleague);
}
