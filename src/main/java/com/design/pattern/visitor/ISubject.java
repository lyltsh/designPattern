package com.design.pattern.visitor;

public interface ISubject {
    void accept(Visitor visitor);
    String getSubject();
}
