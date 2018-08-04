package com.design.pattern.visitor;

public class MyVisitor implements Visitor {
    @Override
    public void visit(ISubject subject) {
        System.out.println("visit the subject：" + subject.getSubject());
    }
}
