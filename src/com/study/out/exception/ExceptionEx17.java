package com.study.out.exception;

public class ExceptionEx17 {
    public static void main(String[] args) {
        try{
            method2();
        }
        catch (Exception e)
        {
            System.out.println("main 메서드에서 예외 처리 되었습니다.");
        }
    }

    static void method1() throws Exception
    {
        try{
            throw new Exception();
        }catch(Exception e)
        {
            System.out.println("method()1에서 예외 처리되었습니다.");
            throw e;
        }
    }

    static int method2() throws Exception{
        try{
            System.out.println("method2 호출");
            return 0;
        }
        catch(Exception e)
        {
            System.out.println("method2()에서 예외 처리 되었습니다.");
            e.printStackTrace();
            throw e;
//            return 2;
        }

//        return 1;
    }
}
