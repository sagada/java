package com.wmp.out.example2;

import java.util.*;

import static jdk.nashorn.internal.objects.Global.print;

public class ArrayListEx1 {

    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1,4));
        print(list1, list2);

        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);

        System.out.println("lists1.containsAll(list2) :" + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");

        list2.add(3, "A");
        print(list1,list2);

        list2.add(3,"AA");
        print(list1,list2);



    }

}
