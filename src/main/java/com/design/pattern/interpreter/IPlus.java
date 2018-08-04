package com.design.pattern.interpreter;

public class IPlus implements Expression {
    @Override
    public int interpret(IContext context) {
        return context.getNum1() + context.getNum2();
    }
}
