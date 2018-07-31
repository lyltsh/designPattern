package com.design.pattern.singleton.singletonfactory;

public class Singleton {

    private Singleton() {

    }

    public static Singleton getInstance() {
        return SingletonFactory.instance;
    }

    /*
    使用单例工厂模式生成单例
     */
    private static class SingletonFactory {
        private static Singleton instance = new Singleton();
    }

}
