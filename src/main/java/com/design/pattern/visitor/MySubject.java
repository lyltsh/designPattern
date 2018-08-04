package com.design.pattern.visitor;

public class MySubject implements ISubject {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "subject name";
    }
}
