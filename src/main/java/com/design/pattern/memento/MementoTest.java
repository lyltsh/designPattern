package com.design.pattern.memento;

/**
 * 19、备忘录模式（Memento）
 * 主要目的是保存一个对象的某个状态，以便在适当的时候恢复对象，个人觉得叫备份模式更形象些，通俗的讲下：
 * 假设有原始类A，A中有各种属性，A可以决定需要备份的属性，备忘录类B是用来存储A的一些内部状态，
 * 类C呢，就是一个用来存储备忘录的，且只能存储，不能修改等操作。
 */
public class MementoTest {
    public static void main(String[] args) {
        //创建原始类
        Original original = new Original("original");
        //创建备份
        Storage storage = new Storage(original.createMemento());
        //修改原始类的状态
        System.out.println("initial:" + original.getValue());
        original.setValue("newValue");
        System.out.println("new:" + original.getValue());
        //恢复
        original.restoreMemento(storage.getMemento());
        System.out.println("back:" + original.getValue());
    }
}
