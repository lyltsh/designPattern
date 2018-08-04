package com.design.pattern.mediator;

public class MyMediator implements Mediator {
    private MUser1 user1;
    private MUser2 user2;


    @Override
    public void createMediator() {
        user1 = new MUser1(this);
        user2 = new MUser2(this);
    }

    @Override
    public void workAll() {
        user1.work();
        user2.work();
    }

    public MUser1 getUser1() {
        return user1;
    }

    public MUser2 getUser2() {
        return user2;
    }

}
