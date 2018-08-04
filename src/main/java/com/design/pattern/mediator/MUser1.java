package com.design.pattern.mediator;

public class MUser1 extends MUser {
    public MUser1(Mediator mediator) {
        super(mediator);
    }

    @Override
    void work() {
        System.out.println("user1 exe!");
    }
}
