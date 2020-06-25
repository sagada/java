package com.study.out.exception;

public class ExceptionEx1 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try{
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        }catch (ArithmeticException e)
        {
            e.printStackTrace();
            System.out.println("예외 메시지: " + e.getMessage());
        }

        System.out.println(6);

        try
        {
            Exception e = new Exception("고의로 발생시켰음");
            throw e;
        }
        catch(Exception e)
        {
            System.out.println("error 메시지 : " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램이 정상 종료 되었음");
    }

    void exception_break() throws ArithmeticException, Exception
    {

    }

}
