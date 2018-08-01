package com.design.pattern.proxy;

public class Proxy implements Sourceable {
    //对象
    private Source source;

    public Proxy(Source source) {
        this.source = source;
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    private void before(){
        System.out.println("before proxy!");
    }
    private void after(){
        System.out.println("after proxy!");
    }
}
