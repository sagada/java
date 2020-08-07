package com.study.out.iostream2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {
    public static void main(String[] args) {
        try
        {
            byte[] bytes = new byte[2];
            InputStream is = new FileInputStream("/Users/sanghyunyun/Desktop/study/java_init/oasd.txt");
            int readByte;
            while ((readByte = is.read(bytes)) != -1)
            {
                for (int i = 0; i < bytes.length; i++)
                {
                    System.out.println(bytes[i]);
                }
                System.out.println("loop end");
            }
        }catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}
