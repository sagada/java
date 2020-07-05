package com.study.out.iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("src/com/study/out/iostream/file-test2.txt");
            FileOutputStream fos = new FileOutputStream("output.txt");

            int data = 0;
            while ((data = fis.read()) != -1)
            {
                fos.write(data);
            }
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
