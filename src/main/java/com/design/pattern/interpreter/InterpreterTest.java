package com.design.pattern.interpreter;

/**
 * 23、解释器模式（Interpreter）
 * 解释器模式是我们暂时的最后一讲，一般主要应用在OOP开发中的编译器的开发中，所以适用面比较窄。
 * <p>
 * 解释器模式用来做各种各样的解释器，如正则表达式等的解释器等等！
 */
public class InterpreterTest {
    public static void main(String[] args) {
        //9+2-8
        int result = new IMinus().interpret(new IContext(new IPlus().
                interpret(new IContext(9, 2)), 8));
        System.out.println(result);
    }
}
