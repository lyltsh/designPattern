package com.design.pattern.template;

public class Multiply extends AbstractCalculator {
    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}
