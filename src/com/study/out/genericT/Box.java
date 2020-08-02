package com.study.out.genericT;

public class Box<T> {
    private T t;

    public T get() { return t;}

    public void setT(T t) {this.t = t;}

    public <T> Box<T> boxing(T t){
        return new Box<T>();
    }
}
