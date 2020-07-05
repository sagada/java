package com.study.out.iostream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IoStreamEx3 {
    public static void main(String[] args) {
        try
        {
            FileInputStream fis = new FileInputStream("/Users/sanghyunyun/Desktop/study/java_init/src/com/study/out/iostream/file-test.txt");
            InputStreamReader reader = new InputStreamReader(fis, "UTF-8");

            int data = 0;
            while( (data = reader.read()) != -1)
            {
                char c = (char)data;
                System.out.println(c);
            }
        }
        catch(IOException e)
        {

        }

    }
}
