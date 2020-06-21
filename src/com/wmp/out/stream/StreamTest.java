package com.wmp.out.stream;


import java.sql.Struct;
import java.util.*;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {
        List<Student> s = givenStudent();

        List<String> names = s.stream()
                .sorted(Comparator.comparing((Student::getName)).reversed())
                .map(Student::getName)
                .map(String::toUpperCase)
                .distinct()
                .collect(Collectors.toList());

        names.forEach(System.out::println);

        
    }

    static List<Student> givenStudent()
    {
        List<Student> s = new ArrayList<>();
        s.add(new Student("abcd1", 3, 300));
        s.add(new Student("abcd1", 3, 400));
        s.add(new Student("abce2", 3, 300));
        s.add(new Student("abce2", 3, 300));
        s.add(new Student("aAEQe", 3, 300));
        s.add(new Student("A", 3, 300));
        s.add(new Student("a", 3, 300));
        s.add(new Student("E", 3, 300));
        s.add(new Student("e", 3, 300));

        return s;
    }
}

class Student implements Comparable<Student> {
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
