package com.design.pattern.factory.factorymethod;

public class MessageSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new MessageSender();
    }
}
