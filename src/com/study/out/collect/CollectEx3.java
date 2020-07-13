package com.study.out.collect;

import java.util.*;

import static java.util.stream.Collectors.*;

public class CollectEx3 {


    public static void main(String[] args) {

        List<Student2> stuStream = new ArrayList<>();

        stuStream.add(new Student2("나자바", true, 1, 1, 300));
        stuStream.add(new Student2("김지미", false, 1, 1, 250));
        stuStream.add(new Student2("김자바", true, 1, 1, 200));
        stuStream.add(new Student2("이지미", false, 1, 2, 150));
        stuStream.add(new Student2("남자바", true, 1, 2, 100));
        stuStream.add(new Student2("안지미", false, 1, 2, 50));
        stuStream.add(new Student2("황지미", false, 1, 3, 100));
        stuStream.add(new Student2("강지미", false, 1, 3, 150));
        stuStream.add(new Student2("이자바", true, 1, 3, 200));

        stuStream.add(new Student2("나자바", true, 2, 1, 300));
        stuStream.add(new Student2("김지미", false, 2, 1, 250));
        stuStream.add(new Student2("김자바", true, 2, 1, 200));
        stuStream.add(new Student2("이지미", false, 2, 2, 150));

        stuStream.add(new Student2("남자바", true, 2, 2, 100));
        stuStream.add(new Student2("안지미", false, 2, 2, 50));
        stuStream.add(new Student2("황지미", false, 2, 3, 100));
        stuStream.add(new Student2("강지미", false, 2, 3, 150));
        stuStream.add(new Student2("이자바", true, 2, 3, 200));

        //기본 분할
        Map<Boolean, List<Student2>> stuBySex = stuStream.stream().collect(partitioningBy(Student2::isMale));
        List<Student2> maleStudents = stuBySex.get(true);
        List<Student2> femaleStudents = stuBySex.get(false);


        //기본 분할 + 통계 정보
        Map<Boolean, Long> stuNumBySex = stuStream.stream().collect(partitioningBy(Student2::isMale, counting()));
        System.out.println("남학생 수 : " + stuNumBySex.get(true));
        System.out.println("여학생 수 : " + stuNumBySex.get(false));

        Map<Boolean, Optional<Student2>> topScoreBySex = stuStream
                .stream()
                .collect(partitioningBy(Student2::isMale, maxBy(Comparator.comparingInt(Student2::getScore))));

        for (Map.Entry<Boolean, Optional<Student2>> entry : topScoreBySex.entrySet()) {
            System.out.println(entry.getKey() + " / " + entry.getValue());
        }

        Map<Boolean, Map<Boolean, List<Student2>>> failedStuBySex = stuStream
                .stream()
                .collect(partitioningBy(Student2::isMale, partitioningBy(s->s.getScore() < 150)));

        System.out.println("_____________________ 2중 파티셔닝 출력 ___________________");
        for (Map.Entry<Boolean, Map<Boolean, List<Student2>>> entry : failedStuBySex.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}

class Student2 {
    String name; //이름
    boolean isMale; //성별
    int hak; // 학년
    int ban; // 반
    int score; // 점수

    public Student2(String name, boolean isMale, int hak, int ban, int score) {
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student2[" +
                "name='" + name + '\'' +
                ", isMale=" + isMale +
                ", hak=" + hak +
                ", ban=" + ban +
                ", score=" + score +
                ']';
    }

    enum Level{
        HIGH, MID, LOW
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
}
