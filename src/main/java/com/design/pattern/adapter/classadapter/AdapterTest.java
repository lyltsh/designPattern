package com.design.pattern.adapter.classadapter;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/8/1
 */
public class AdapterTest {
    public static void main(String[] args){
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}
