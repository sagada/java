package com.wmp.out;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("김자바", new Integer(100));
        map.put("김자바", new Integer(90));
        map.put("안자바", new Integer(120));
        map.put("고자바", new Integer(70));
        map.put("윤자바", new Integer(80));

        Set set = map.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext())
        {
            Map.Entry e = (Map.Entry)it.next();
            System.out.println("이름 : " + e.getKey() + " 점수 : " + e.getValue());
        }

    }
}

