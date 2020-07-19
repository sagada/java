package com.study.out.StandardInter;


public class RunnableExample1 {
    public static void main(String[] args) {
        Runnable runnable = () ->{
            for(int i = 0 ;i  < 10 ;i++)
            {
                System.out.println(i);
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();


        Thread thread1 = new Thread(()->{
            System.out.println("헤헤");
        });
        thread1.start();

    }
}
