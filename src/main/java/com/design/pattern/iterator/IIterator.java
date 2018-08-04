package com.design.pattern.iterator;

public interface IIterator {
    Object previous();
    Object next();
    boolean hasNext();
    Object first();
}
