package com.study.out.predicate;

import java.util.function.Predicate;

interface MyFunction{
    public abstract int max(int a, int b);
}


public class PredicateEx1 {
    public static void main(String[] args) {
        MyFunction f = new MyFunction(){

            @Override
            public int max(int a, int b) {
                return a < b ? 1 : 0 ;
            }
        };
        System.out.println(f.max(1,3));

        Predicate<String> imEmptyStr = s -> s.length() == 0;

        String s = "";
        if(imEmptyStr.test(s))
        {
            System.out.println("없어요...");
        }
        else
        {
            System.out.println("있어요...");
        }
    }
}
