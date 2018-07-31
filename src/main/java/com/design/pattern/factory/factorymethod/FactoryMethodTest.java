package com.design.pattern.factory.factorymethod;

public class FactoryMethodTest {
    public static void main(String[] args) {
        MessageSenderFactory messageSenderFactory = new MessageSenderFactory();
        messageSenderFactory.produce().sendThing();

        EmailSenderFactory emailSenderFactory = new EmailSenderFactory();
        emailSenderFactory.produce().sendThing();
    }
}
