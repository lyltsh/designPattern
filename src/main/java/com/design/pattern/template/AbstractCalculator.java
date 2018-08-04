package com.design.pattern.template;

public abstract class AbstractCalculator {
    public final int calculate(String exp, String opt) {
        int[] ints = split(exp, opt);
        return calculate(ints[0],ints[1]);
    }

    public abstract int calculate(int a, int b);

    private int[] split(String exp, String opt){
        String array[] = exp.split(opt);
        int[] arrayInt = new int[2];
        arrayInt[0] = Integer.valueOf(array[0]);
        arrayInt[1] = Integer.valueOf(array[1]);
        return arrayInt;
    }
}
