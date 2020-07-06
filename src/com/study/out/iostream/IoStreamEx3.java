package com.study.out.iostream;

import java.io.*;

public class IoStreamEx3 {
    public static void main(String[] args) {
        try {
            String fileName = "/Users/sanghyunyun/Desktop/study/java_init/src/com/study/out/iostream/file-test.txt";
            FileInputStream fis = new FileInputStream(fileName);
            FileReader fr = new FileReader(fileName);

            int data = 0;
            while ((data = fis.read()) != -1)
            {
                System.out.println((char) data);
            }

            System.out.println();
            fis.close();
            while ((data = fr.read()) != -1)
            {
                System.out.println((char) data);

            }

            System.out.println();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
