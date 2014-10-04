package com.udev.behavior.chainofresponsibility;

/**
 * Created by Taipan on 04.10.2014.
 */
public class Client {
    public static void main(String[] args) {
        Handler h1 = new Handler1();
        Handler h2 = new Handler2();
        Handler h3 = new Handler3();
        Handler h4 = new Handler4();
        h1.setNextHandler(h2);
        h2.setNextHandler(h3);
        h3.setNextHandler(h4);
        h1.process("Message to h1", 1);
        h1.process("Message to h2", 2);
        h1.process("Message to h3", 3);
        h1.process("Message to h4", 4);
    }
}
