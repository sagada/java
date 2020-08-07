package com.study.out.genericT.genericChild;

public class StorageImpl<T> implements Storage<T>{

    private T[] array;

    public StorageImpl(int c)
    {
        this.array = (T[])(new Object[c]);
    }

    @Override
    public void add(T item, int index) {

    }

    @Override
    public T get(int index) {
        return null;
    }
}
