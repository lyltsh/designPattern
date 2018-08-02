package com.design.pattern.adapter.classadapter;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/8/1
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
