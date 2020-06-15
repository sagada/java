package com.wmp.out.Threads;

public class ThreadEx5 {
    static long sstartTime = 0;

    public static void main(String[] args) {
        ThreadEx_1 th1 = new ThreadEx_1();
        th1.start();

    }
}

class ThreadEx_1 extends Thread{
    public void run()
    {
        for(int i = 0 ; i < 300; i++)
        {
            System.out.printf("%s", new String("|"));
        }
        System.out.print("소요시간 2 : " + (System.currentTimeMillis() - ThreadEx5.sstartTime));
    }
}

