package com.study.out.iostream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoStreamEx3 {
    public static void main(String[] args) {
        try
        {
            FileOutputStream fos = new FileOutputStream("file-output-stream.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos, 5);

            for(int i = '1' ; i <= '9' ; i++)
            {
                bos.write(i);
            }

            bos.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}
