package com.design.pattern.factory.factorymethod;

public class MessageSender implements Sender
{
    @Override
    public void sendThing() {
        System.out.println("messageSender");
    }
}
