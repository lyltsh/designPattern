package com.design.pattern.template;

public class Minus extends AbstractCalculator {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
