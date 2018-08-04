package com.design.pattern.strategy;

public class AbstractCalculator {
    public int[] split(String exp, String opt) {
        String array[] = exp.split(opt);
        int[] arrayInt = new int[2];
        arrayInt[0] = Integer.valueOf(array[0]);
        arrayInt[1] = Integer.valueOf(array[1]);
        return arrayInt;
    }
}
