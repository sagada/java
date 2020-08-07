package com.study.out.genericT.genericChild;

public class ChildProductAndStorageExample {
    public static void main(String[] args) {
        Storage<Tv> storage = new StorageImpl<Tv>(100);
        storage.add(new Tv(), 0);


    }
}
