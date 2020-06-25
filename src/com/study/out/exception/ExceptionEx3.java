package com.study.out.exception;

import java.io.File;

public class ExceptionEx3 {
    public static void main(String[] args) {
        try{
            File f = createFile("ysh");
        }catch (Exception e)
        {
            System.out.println(e.getMessage() +" 이름을 다시 입력해주세");
        }
    }

    static File createFile(String fileName) throws Exception
    {
        if(fileName == null || fileName.equals(""))
            throw new Exception("이름이 유효 하지 않습니다.");

        File f = new File(fileName);

        f.createNewFile();
        return f;
    }
}
