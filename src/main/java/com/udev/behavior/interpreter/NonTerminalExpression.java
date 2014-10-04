package com.udev.behavior.interpreter;

/**
 * Created by Taipan on 04.10.2014.
 */
public class NonTerminalExpression implements Expression {
    @Override
    public void interpret(Context context) {
        System.out.println("NonTerminalExpression");
    }
}
