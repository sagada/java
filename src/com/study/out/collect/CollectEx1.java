package com.study.out.collect;


import java.util.*;
import java.util.stream.Collectors;

class CollectEx1 {
    public static void main(String[] args) {
        Student[] stuArr = {
                new Student("이자바", 3, 200),
                new Student("김자바", 1, 200),
                new Student("안자바", 2, 100),
                new Student("박자바", 2, 150),
                new Student("소자바", 1, 200),
                new Student("나자바", 3, 290),
                new Student("감자바", 3, 180)
        };
        System.out.println("----------------이름 출력 ----------------");
        List<String> names = Arrays.stream(stuArr).map(Student::getName).collect(Collectors.toList());
        names.forEach(System.out::println);

        System.out.println("----------------점수 출력 ----------------");
        List<Integer> scores = Arrays.stream(stuArr).map(Student::getTotalScore).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        scores.forEach(System.out::println);

        System.out.println("---------- 학생 이름 / 점수 분류 ------------");
        Map<String, Integer> studentMap = Arrays
                .stream(stuArr)
                .collect(Collectors.toMap(Student::getName, Student::getTotalScore));

        for(Map.Entry<String,Integer> entry: studentMap.entrySet())
        {
            System.out.println("이름 :  " + entry.getKey() + " / 점수 : " + entry.getValue());
        }

        long count = Arrays.stream(stuArr).count();
        System.out.println("총 인원 :" + count);

        long totalScore = Arrays.stream(stuArr).mapToInt(Student::getTotalScore).sum();
        System.out.println("totalScore : " +  totalScore);

        IntSummaryStatistics stat = Arrays.stream(stuArr).collect(Collectors.summarizingInt(Student::getTotalScore));
        System.out.println(stat.getAverage());
        System.out.println(stat.getMax());
        System.out.println(stat.getCount());
        System.out.println(stat.getSum());

    }
}

class Student implements Comparable<Student>{
    String name;
    int ban;
    int totalScore;

    public Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", totalScore=" + totalScore +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int compareTo(Student s)
    {
        return s.totalScore - this.totalScore;
    }
}
