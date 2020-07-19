package com.study.out.StandardInter;

public class MyFuncTionalEx {
    public static void main(String[] args) {
        MyFuncTional f = ()-> System.out.println("안녕하세요");
        f.method();

        FuncTest ft = Integer::sum;
        System.out.println(ft.test(3, 4));


    }
}
