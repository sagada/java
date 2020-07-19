package com.study.out.StandardInter;

import java.util.function.ToIntFunction;

public class FunctionalExample2 {

    public static double avg(ToIntFunction<Student> function)
    {
        int sum = 0;
        for(Student student : FunctionalExample.list)
        {
            sum += function.applyAsInt(student); // 람다식 실행
        }
        return (double) sum / FunctionalExample.list.size();
    }

    public static void main(String[] args) {

        double englishAvg = avg(Student::getEnglishScore);
        System.out.println("영어 평균 점수 : " + englishAvg);

        double mathAvg = avg(Student::getMathScore);
        System.out.println("수학 평균 점수 : " + mathAvg);

    }
}
