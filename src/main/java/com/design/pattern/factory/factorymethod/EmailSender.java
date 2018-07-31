package com.design.pattern.factory.factorymethod;

public class EmailSender implements Sender {
    @Override
    public void sendThing() {
        System.out.println("sendThing");
    }
}
