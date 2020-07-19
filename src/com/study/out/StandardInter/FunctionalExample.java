package com.study.out.StandardInter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionalExample {

    public static List<Student> list = Arrays.asList(
            new Student("홍길동", 90, 96),
            new Student("신용권", 100, 90),
            new Student("박찬허",  93, 91)
    );

    public static void printString(Function<Student, String> function)
    {
        for (Student student : list)
        {
            System.out.println(function.apply(student) + " ");
        }
        System.out.println();
    }

    public static void printInt(ToIntFunction<Student> function)
    {
        for (Student student : list)
        {
            System.out.println(function.applyAsInt(student) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        System.out.println("[학생 이름]");
        printString(Student::getName);

        System.out.println("[영어 점수]");
        printInt(Student::getEnglishScore);

        System.out.println("[수학 점수]");
        printInt(Student::getMathScore);
    }
}

