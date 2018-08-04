package com.design.pattern.responsibility;

public abstract class AbstractHandler {
    private Handler handler;

    protected Handler getHandler() {
        return handler;
    }

    protected void setHandler(Handler handler) {
        this.handler = handler;
    }
}
