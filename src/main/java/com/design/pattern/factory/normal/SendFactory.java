package com.design.pattern.factory.normal;

public class SendFactory {

    public Sender produce(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else {
            System.out.println("please input exact type");
            return null;
        }
    }
}
