package com.study.out.StandardInter;

import java.util.function.IntBinaryOperator;

public class OperatorInterface {
    private static int [] scores  = {72, 23, 31};

    public static int maxOrMin(IntBinaryOperator intBinaryOperator)
    {
        int result = scores[0];

        for (int score : scores)
        {
            result = intBinaryOperator.applyAsInt(result, score);
        }

        return result;
    }

    public static void main(String[] args) {
        int max = maxOrMin(Math::max);
        System.out.println("최대값 :  " + max);

        int min = maxOrMin(Math::min);

        System.out.println("최소 값 : " + min);

    }
}
