package com.design.pattern.factory.normal;

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("MailSender");
    }
}
