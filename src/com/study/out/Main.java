package com.study.out;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Friend kim = new Friend("Kim", 36);
        Friend park = new Friend("Park", 20);
        Friend lee = new Friend("Lee", 28);
        Friend yong = new Friend("Yong", 18);

        List<Friend> d = new ArrayList<>();
        d.add(kim);
        d.add(park);
        d.add(lee);
        d.add(yong);

        Collections.sort(d);

        System.out.println(d);
    }
}

class Friend implements Comparable<Friend>{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Friend(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Friend o) {

        return o.age - this.age;
    }
}


