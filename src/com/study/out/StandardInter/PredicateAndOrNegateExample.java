package com.study.out.StandardInter;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateAndOrNegateExample {
    public static void main(String[] args) {

        IntPredicate predicateA = a -> a % 2 == 0;
        IntPredicate predicateB = b -> b % 3 == 0;
        IntPredicate predicateAB;

        boolean result;

        // and ()
        predicateAB = predicateA.and(predicateB);

        result = predicateAB.test(9);

        System.out.println("9는 2와 3의 배수 입니꽈?");
        System.out.println(result);

        //or
        predicateAB = predicateA.or(predicateB);
        System.out.println(predicateAB.test(10));

        //negate()
        predicateAB = predicateA.negate();
        System.out.println("9는 홀수 입니까?" + predicateAB.test(9));


        Predicate<String> predicate;

        predicate = Predicate.isEqual(null);
        System.out.println("null, null : " + predicate.test(null));

        predicate = Predicate.isEqual("Java8");
        System.out.println("null, Java8 : " + predicate.test(null));

        predicate = Predicate.isEqual(null);
        System.out.println("Java8, null : " + predicate.test("Java8"));

        predicate = Predicate.isEqual("Java8");
        System.out.println("Java8, Java8 : " + predicate.test("Java8"));

        predicate = Predicate.isEqual("야생마");
        System.out.println("야생마, 야생마 : " + predicate.test("야생마"));

        
    }
}
