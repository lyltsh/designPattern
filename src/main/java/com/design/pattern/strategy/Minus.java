package com.design.pattern.strategy;

public class Minus extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int[] ints = split(exp, "\\-");
        return ints[0] - ints[1];
    }
}
