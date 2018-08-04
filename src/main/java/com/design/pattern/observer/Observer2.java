package com.design.pattern.observer;

public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("observer2 has received!");
    }

    private Observer2() {
    }

    public static Observer2 getInstance() {
        return Observer2Factory.instance;
    }

    private static class Observer2Factory {
        private static Observer2 instance = new Observer2();
    }
}
