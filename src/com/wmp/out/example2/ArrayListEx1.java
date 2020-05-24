package com.wmp.out.example2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class ArrayListEx1 {

    public static void main(String[] args) {
        String[] strArr = {"lion", "cat", "dog", "tiger"};

        Arrays.sort(strArr);

        System.out.println("strArr : " + Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
        System.out.println("strArr : " + Arrays.toString(strArr));

        Arrays.sort(strArr, new Desc());
        System.out.println("strArr : " + Arrays.toString(strArr));₩
    }

}

class Desc implements Comparator
{
    @Override
    public int compare(Object o1, Object o2) {
        if( o1 instanceof Comparable && o2 instanceof Comparable){
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c1.compareTo(c2) * -1 ;
        }
        return -1;
    }
}

