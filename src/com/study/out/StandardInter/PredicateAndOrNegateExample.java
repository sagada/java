package com.study.out.StandardInter;

import java.util.function.IntPredicate;

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

    }
}
