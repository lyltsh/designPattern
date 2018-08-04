package com.design.pattern.observer;

import java.util.ArrayList;

public abstract class AbstractSubject implements Subject{
    private ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update();
        }
    }
}
