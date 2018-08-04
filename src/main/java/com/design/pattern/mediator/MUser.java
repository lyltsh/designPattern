package com.design.pattern.mediator;

public abstract class MUser {
    private Mediator mediator;

    abstract void work();

    public MUser(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }
}
