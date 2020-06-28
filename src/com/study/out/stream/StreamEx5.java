package com.study.out.stream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx5 {
    public static void main(String[] args) {

        IntStream intStream = new Random().ints(1, 46);
        Stream<String> lottoStream = intStream.distinct().limit(6).mapToObj(s->s + "");
        lottoStream.forEach(System.out::println);

        IntStream charStream = "12345".chars();
        int charSum = charStream.map(ch->ch-'0').sum();
        System.out.println("Char SUM : " + charSum);

        List<Student> students = new ArrayList<>();
        students.add(new Student("이자바",3,300));
        students.add(new Student("김자바",1,200));
        students.add(new Student("안자바",2,100));
        students.add(new Student("박자바",2,150));
        students.add(new Student("소자바",1,200));
        students.add(new Student("나자바",3,290));
        students.add(new Student("감자바",3,180));


        students.stream().sorted(Comparator.comparing(Student::getBan)
            .thenComparing(Comparator.naturalOrder()))
            .forEach(System.out::println);

        System.out.println("-------------");

        IntStream stuScoreStream = students.stream().mapToInt(Student::getTotalScore);
        IntSummaryStatistics stat = stuScoreStream.summaryStatistics();
        System.out.println("total score : " + stat.getSum());
        System.out.println("average : " + stat.getAverage());
        System.out.println("Min : " +  stat.getMin());
        System.out.println("Max : " + stat.getMax());
    }
}
