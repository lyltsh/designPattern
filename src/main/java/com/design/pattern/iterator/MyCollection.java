package com.design.pattern.iterator;

public class MyCollection implements ICollection {
    private Object[] values = {"a","b","c"};

    @Override
    public IIterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return values[i];
    }

    @Override
    public int size() {
        return values.length;
    }
}
