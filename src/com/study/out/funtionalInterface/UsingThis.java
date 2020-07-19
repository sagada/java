package com.study.out.funtionalInterface;

public class UsingThis {
    public int outterField = 10;

    class Inner{
        int innerField = 20;

        void method()
        {
            //람다식
            MyFunctionalInterface fi = () -> {
                System.out.println("outerFiled : " + outterField);
                System.out.println("outerFile d : " + UsingThis.this.outterField + "\n");

                System.out.println("innerFiled : " + innerField);

                System.out.println("innerFiled : " + this.innerField + "\n");

            };
            fi.method();
        }
    }
}
