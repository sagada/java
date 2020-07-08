package com.study.out.iostream;

import java.io.BufferedReader;
import java.io.FileReader;

public class IoStreamEx5 {
    public static void main(String[] args) {
        try
        {
            FileReader fr = new FileReader("/Users/sanghyunyun/Desktop/study/java_init/src/com/study/out/iostream/IoStreamEx5.java");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            for (int i = 1; (line = br.readLine()) != null; i++)
            {
                if(line.contains(";"))
                {
                    System.out.println(i + ":" + line);
                }
            }
            br.close();
        } catch (Exception e)
        {

        }

    }
}
