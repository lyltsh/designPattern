package com.design.pattern.factory.factorymethod;

public class EmailSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new EmailSender();
    }
}
