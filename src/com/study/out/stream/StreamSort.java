package com.study.out.stream;


import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamSort {
    public static void main(String[] args) {

        System.out.println("문자 길이 역순 정렬");
        Stream<String> strStream = Stream.of("dd", "aaa","CC","cc","d","ddddddd");
        strStream.sorted((s1,s2)->s2.length() - s1.length()).forEach(System.out::println);

        System.out.println("숫자 내림 차순");
        Stream<Integer> replay = Stream.of(123,1234,12345);
        replay.sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("문자열 길이 역순 정렬");
        Stream<String> strLengthStream = Stream.of("dad","qweqweq","we","v","qweqeqweqw");
        strLengthStream.sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);

        List<Student> students = new ArrayList<>();
        students.add(new Student("이자바",3,300));
        students.add(new Student("김자바",1,200));
        students.add(new Student("안자바",2,100));
        students.add(new Student("박자바",2,150));
        students.add(new Student("소자바",1,200));
        students.add(new Student("나자바",3,290));
        students.add(new Student("감자바",3,180));

        students.stream().sorted(Comparator.comparing(Student::getBan)
                .thenComparing(Student::getName))
                .forEach(System.out::println);


    }
}

