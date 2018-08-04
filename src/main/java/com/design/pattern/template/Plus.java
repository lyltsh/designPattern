package com.design.pattern.template;

public class Plus extends AbstractCalculator {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
