package com.study.out.iostream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IoStreamEx4 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("/Users/sanghyunyun/Desktop/study/java_init/src/com/study/out/iostream/file-test.txt");
            FileWriter fw = new FileWriter("/Users/sanghyunyun/Desktop/study/java_init/src/com/study/out/iostream/output-test2.txt");
            int data = 0;
            while ((data = fr.read()) != -1)
            {
                if(data != '\t' && data != '\n' && data != ' ' && data != '\r')
                {
                    fw.write(data);
                }
            }

            fr.close();;
            fw.close();

        } catch (IOException e) {

        }
    }
}
