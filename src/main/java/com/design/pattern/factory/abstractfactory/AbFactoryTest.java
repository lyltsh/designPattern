package com.design.pattern.factory.abstractfactory;

public class AbFactoryTest {
    public static void main(String[] args){
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        shapeFactory.getShape("CIRCLE").draw();

        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
    }
}
