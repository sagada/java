package com.study.out.collect;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectEx5 {
    public static void main(String[] args) {
        List<Student5> stuStream = new ArrayList<>();

        stuStream.add(new Student5("나자바", true, 1, 1, 300));
        stuStream.add(new Student5("김지미", false, 1, 1, 250));
        stuStream.add(new Student5("김자바", true, 1, 1, 200));
        stuStream.add(new Student5("이지미", false, 1, 2, 150));
        stuStream.add(new Student5("남자바", true, 1, 2, 100));
        stuStream.add(new Student5("안지미", false, 1, 2, 50));
        stuStream.add(new Student5("황지미", false, 1, 3, 100));
        stuStream.add(new Student5("강지미", false, 1, 3, 150));
        stuStream.add(new Student5("이자바", true, 1, 3, 200));
        stuStream.add(new Student5("나자바", true, 2, 1, 300));
        stuStream.add(new Student5("김지미", false, 2, 1, 250));
        stuStream.add(new Student5("김자바", true, 2, 1, 200));
        stuStream.add(new Student5("이지미", false, 2, 2, 150));
        stuStream.add(new Student5("남자바", true, 2, 2, 100));
        stuStream.add(new Student5("안지미", false, 2, 2, 50));
        stuStream.add(new Student5("황지미", false, 2, 3, 100));
        stuStream.add(new Student5("강지미", false, 2, 3, 150));
        stuStream.add(new Student5("이자바", true, 2, 3, 200));

        Map<Student5.Level, Long> stuByLevel = stuStream
                .stream()
                .collect(
                        Collectors.groupingBy(s->{
                            if(s.getScore() >=200) return Student5.Level.HIGH;
                            else if(s.getScore() >= 100) return Student5.Level.MID;
                            else return Student5.Level.LOW;

                        }, Collectors.counting())
                );

        for (Map.Entry<Student5.Level, Long> entry : stuByLevel.entrySet())
        {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        Map<Integer, List<Student5>> stuByBan = stuStream.stream().collect(Collectors.groupingBy(
                Student5::getBan));

        for (Map.Entry<Integer, List<Student5>> entry : stuByBan.entrySet())
        {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        Map<Boolean, Optional<Student5>> topScoreBySex = stuStream.stream().collect(
                Collectors.partitioningBy(Student5::isMale, Collectors.maxBy(Comparator.comparingInt(Student5::getScore)))
        );

        System.out.println("남학생 1등 : " + topScoreBySex.get(true));
        System.out.println("여학생 1등 : " + topScoreBySex.get(false));

        Map<Integer, List<Student5>> stuByBan1 = stuStream.stream().collect(
                Collectors.groupingBy(Student5::getBan));

        for (Map.Entry<Integer, List<Student5>> entry : stuByBan1.entrySet())
        {
            System.out.println(entry.getKey() + " / " + entry.getValue());
        }



    }
    private static List<Long> listgets(int i)
    {
        List<Long> t1 = Arrays.asList(1111L,2222L,3333L);
        List<Long> t2 = Arrays.asList(4444L,5555L,6666L);
        List<Long> t3 = Arrays.asList(7777L,8888L,9999L);
        if(i == 1)
        {
            return t1;
        }
        else if(i == 2)
        {
            return t2;
        }
        else
        {
            return t3;
        }
    }
}

class Student5 {
    String name; //이름
    boolean isMale; //성별
    int hak; // 학년
    int ban; // 반
    int score; // 점수

    public Student5(String name, boolean isMale, int hak, int ban, int score) {
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student5[" +
                "name='" + name + '\'' +
                ", isMale=" + isMale +
                ", hak=" + hak +
                ", ban=" + ban +
                ", score=" + score +
                ']';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public int getHak() {
        return hak;
    }

    public void setHak(int hak) {
        this.hak = hak;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    enum Level{
        HIGH, MID, LOW
    }
}
