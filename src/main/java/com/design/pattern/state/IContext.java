package com.design.pattern.state;

public class IContext {
    private IState state;

    public void method() {
        if ("state1".equals(state.getValue())) {
            state.method1();
        } else if ("state2".equals(state.getValue())) {
            state.method2();
        }
    }

    public IContext(IState state) {
        this.state = state;
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }
}
