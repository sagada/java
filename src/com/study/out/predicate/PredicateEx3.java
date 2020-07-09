package com.study.out.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static java.util.Arrays.asList;

public class PredicateEx3 {
    public static void main(String[] args) {
        Predicate<Integer> predicate = i->i % 2 ==0 ;

        List<Integer> list = asList(1,2,3,4,5,6);

        preTest(predicate, list);


        Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };

        Consumer<String> consumer =  s -> {
            System.out.println(s);
        };

        System.out.println("---------");
        preTest(p, list);

        System.out.println("consumer interface call");
        List<String> strs = asList("신용재","하은","따라하면안돼");
        conSumerTest(consumer, strs);
    }

    static <T> void conSumerTest(Consumer<String> c, List<String> list)
    {
        for (String str : list)
        {
            c.accept(str);
        }
    }

    static <T> void preTest(Predicate<Integer> p, List<Integer> list)
    {
        for (int i : list)
        {
            if(p.test(i))
            {
                System.out.println("짝수");
            }
            else{
                System.out.println("홀수");
            }
        }
    }

}
