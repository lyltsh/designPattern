package com.design.pattern.factory.normal;

public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("SmsSender");
    }
}
