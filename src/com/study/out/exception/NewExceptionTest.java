package com.study.out.exception;

public class NewExceptionTest {
    public static void main(String[] args) {
        try{
            startInstall();
        }catch (SpaceException e)
        {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
            System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
        }catch (MemoryException me)
        {
            System.out.println("에러 메시지 : " + me.getMessage());
            me.printStackTrace();
            System.gc(); //Garbage Collection 을 수행하여 메모리를 늘려준다.
            System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
        }finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException
    {
        if(!enoughSpace())
        {
            throw new SpaceException("설치할 공간이 부족합니다.");
        }
        if(enoughMemory())
            throw new MemoryException("메모리가 부족합니다.");
    }

    static void copyFiles(){}
    static void deleteTempFiles(){}
    static boolean enoughSpace(){
        return false;
    }

    static boolean enoughMemory(){
        return true;
    }


}

class SpaceException extends Exception
{
    SpaceException(String msg)
    {
        super(msg);
    }
}

class MemoryException extends Exception
{
    MemoryException(String msg)
    {
        super(msg);
    }
}