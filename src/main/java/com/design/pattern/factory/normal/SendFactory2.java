package com.design.pattern.factory.normal;

public class SendFactory2 {
    public static Sender produceMail(){
        return new MailSender();
    }
    public static Sender produceSms(){
        return new SmsSender();
    }
}
