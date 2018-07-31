package com.design.pattern.factory.normal;

public class NormalFactoryTest {
    public static void main(String[] args){
        SendFactory factory = new SendFactory();
        factory.produce("mail").send();

        SendFactory2.produceSms().send();
    }
}
