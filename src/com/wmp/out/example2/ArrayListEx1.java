package com.wmp.out.example2;


import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {

    public static void main(String[] args) {
        final int LIMIT = 10;
        String source = "01234567890abcdefghijklmngABCASDQWE";


        int length = source.length();
        List list = new ArrayList<>(length/LIMIT + 10);


        for (int i = 0; i < length; i++)
        {
            if (i + LIMIT < length)
            {
                list.add(source.substring(i, i + LIMIT));
            }
            else
            {
                list.add(source.substring(i));
            }
        }

    }

}
