package com.design.pattern.mediator;

public class MUser2 extends MUser {
    public MUser2(Mediator mediator) {
        super(mediator);
    }

    @Override
    void work() {
        System.out.println("user2 exe!");
    }
}
