package com.study.out.predicate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class PredicateEx2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++)
            list.add(i);

        list.forEach(System.out::println);

        System.out.println();

        list.removeIf(x-> x % 2 == 0);
        list.forEach(System.out::println);


        list.replaceAll(i->i*10);

        list.forEach(System.out::println);
        Map<String, String> map = new HashMap<>();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        map.put("4","4");

        map.forEach((k, v)-> System.out.println());

        IntSupplier s = ()->(int) (Math.random() * 100) + 1;

        IntConsumer c = i ->System.out.println(i + ", ");

        IntPredicate p = i -> i % 2 == 0;

        Function<Integer, Integer> f = i -> i / 10 * 10;

        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(59);

        list2.add(61);

        list2.add(90);


//        System.out.println("makeRandomList 출력");
//        makeRandomList(s, list2);

//        doSomething(f, list2).forEach(System.out::println);

        printEvenNum(p, c, new int[10]);

    }

    static void printEvenNum(IntPredicate p, IntConsumer c, int []arr)
    {
        System.out.println("[");
        for (int i : arr)
        {
            if(p.test(i))
            {
                c.accept(i);
            }
        }
        System.out.println("]");
    }
    static <T> List<T> doSomething(Function<T, T> f, List<T> list)
    {
        List<T> newList = new ArrayList<T>(list.size());
        for (T i : list)
        {
            newList.add((f.apply(i)));
        }

        return newList;
    }

    static <T> void makeRandomList(Supplier<T> s, List<T> list)
    {
        for (int i = 0; i < 3 ; i++)
        {
            list.add(s.get());
        }

        list.forEach(System.out::println);
    }
}
