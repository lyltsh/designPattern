package com.design.pattern.observer;

public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new MySubject();
        subject.add(Observer1.getInstance());
        subject.add(Observer2.getInstance());
        subject.operation();
        subject.remove(Observer1.getInstance());
        subject.remove(Observer2.getInstance());
        subject.operation();
    }
}
