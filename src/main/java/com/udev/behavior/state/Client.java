package com.udev.behavior.state;

/**
 * Created by Taipan on 05.10.2014.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.request("Test String");
        context.request("Test String");
        context.request("Test String");
        context.request("Test String");
    }
}
