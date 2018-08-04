package com.design.pattern.observer;

public class Observer1 implements Observer {
    private static Observer1 instance;

    private Observer1() {
    }

    public static Observer1 getInstance() {
        if (null == instance) {
            //类锁
            synchronized (Observer1.class) {
                if (null == instance) {
                    instance = new Observer1();
                }
                return instance;
            }
        }
        return instance;
    }

    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }
}
