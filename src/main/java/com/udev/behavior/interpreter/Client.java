package com.udev.behavior.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Taipan on 04.10.2014.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        List<Expression> expressions = new ArrayList<>();
        expressions.add(new NonTerminalExpression());
        expressions.add(new TerminalExpression());
        expressions.add(new NonTerminalExpression());
        expressions.add(new TerminalExpression());
        expressions.add(new TerminalExpression());
        expressions.add(new NonTerminalExpression());
        expressions.add(new NonTerminalExpression());

        for (Expression e : expressions) {
            e.interpret(context);
        }
    }
}
