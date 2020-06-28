package com.study.out.exception;

public class ExceptionEx4 extends Exception{
    private final int ERR_CODE;

    ExceptionEx4(String name, int errCode)
    {
        super(name);
        this.ERR_CODE = errCode;
    }

    ExceptionEx4(String name)
    {
        this(name, 100);
    }

    public int getERR_CODE()
    {
        return ERR_CODE;
    }


}
