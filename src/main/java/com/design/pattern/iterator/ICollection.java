package com.design.pattern.iterator;

public interface ICollection {
    public IIterator iterator();

    /*
    取得集合元素
     */
    Object get(int i);

    /*
    取得集合大小
     */
    int size();
}
