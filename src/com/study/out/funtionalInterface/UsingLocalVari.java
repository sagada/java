package com.study.out.funtionalInterface;

public class UsingLocalVari {
    void method(int arg)
    {
        int localVar = 30;

        MyFunctionalInterface f = ()->{
            // 로컬 변수 읽기
            System.out.println("arg : " + arg);
            System.out.println("lovalVar : " + localVar + "\n");
        };

        f.method();
    }
}
