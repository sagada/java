package com.study.out.stream;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapStreamEx1 {
    public static void main(String[] args) {
        File[] fileArr = {
                new File("Ex1.java"),
                new File("Ex1.bak"),
                new File("Ex2.java"),
                new File("Ex1.txt")
        };
        Stream<File> fileStream = Stream.of(fileArr);

        Stream<String> fileNameStream = fileStream.map(File::getName);
        fileNameStream.forEach(System.out::println);
        fileStream = Stream.of(fileArr);

        fileStream.map(File::getName)
                .filter(s->s.indexOf('.') != -1)
                .map(s->s.substring(s.indexOf('.') + 1))
                .map(String::toUpperCase)
                .distinct()
                .forEach(System.out::println);

        List<Student> students = new ArrayList<>();
        students.add(new Student("이자바",3,300));
        students.add(new Student("김자바",1,200));
        students.add(new Student("안자바",2,100));
        students.add(new Student("박자바",2,150));
        students.add(new Student("소자바",1,200));
        students.add(new Student("나자바",3,290));
        students.add(new Student("감자바",3,180));

        System.out.println("학생들 성적 정렬 후 출력");
        IntStream studentScores = students.stream().sorted(Comparator.reverseOrder()).mapToInt(Student::getTotalScore);

        IntSummaryStatistics stat= studentScores.summaryStatistics();
        System.out.println("total score : " + stat.getSum());
        System.out.println("average : " + stat.getAverage());
        System.out.println("Min : " +  stat.getMin());
        System.out.println("Max : " + stat.getMax());

    }
}
