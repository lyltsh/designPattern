package com.design.pattern.singleton;

public class Singleton {
    private Singleton singleton;

    private Singleton() {
    }

    /*
    双重判断机制
     */
    public Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    return new Singleton();
                }
            }

        }
        return singleton;
    }

    /*
    如果该对象被用于序列化，可以保证对象在序列化前后保持一致
     */
    public Object readResolve(){
        return singleton;
    }
}
