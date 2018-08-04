package com.design.pattern.iterator;

public class MyIterator implements IIterator {
    private MyCollection collection;
    private int pos = -1;

    public MyIterator(MyCollection collection) {
        this.collection = collection;
    }

    @Override
    public Object previous() {
        if (pos > 0) {
            pos--;
        }
        return collection.get(pos);
    }

    @Override
    public Object next() {
        if (pos < collection.size() - 1) {
            pos++;
        }
        return collection.get(pos);
    }

    @Override
    public boolean hasNext() {
        return pos < collection.size() - 1;
    }

    @Override
    public Object first() {
        pos = 0;
        return collection.get(pos);
    }
}
