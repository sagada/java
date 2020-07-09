package com.study.out.predicate;

import java.util.ArrayList;
import java.util.List;
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

        System.out.println("---------");
        preTest(p, list);
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
