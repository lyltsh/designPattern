package com.design.pattern.bridge;

/**
 * 定义一个桥，持有 Sourceable 的一个实例
 */
public abstract class Bridge implements Sourceable {
    private Sourceable source;

    @Override
    public void method() {
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }

}
