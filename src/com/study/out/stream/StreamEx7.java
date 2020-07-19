package com.study.out.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamEx7 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("이자바",3,300));
        students.add(new Student("김자바",1,200));
        students.add(new Student("안자바",2,100));
        students.add(new Student("박자바",2,150));
        students.add(new Student("소자바",1,200));
        students.add(new Student("나자바",3,290));
        students.add(new Student("감자바",3,180));

        Map<Integer, List<Student>> mer = students
                .stream()
                .collect(Collectors.groupingBy(Student::getBan));

        List<StreamG> streamGList = Arrays.asList(
                new StreamG("윤상한",1,1),
                new StreamG("윤상한",1,1),
                new StreamG("윤상한",1,2),
                new StreamG("윤상한",1,2),
                new StreamG("윤상한",1,2),
                new StreamG("윤상한",1,3),
                new StreamG("윤상한",1,4),
                new StreamG("윤상한",1,4),
                new StreamG("윤상한",1,4),
                new StreamG("윤상한",1,4),
                new StreamG("윤상한",1,1),


                new StreamG("윤상한",2,1),
                new StreamG("윤상한",2,2),
                new StreamG("윤상한",2,3),
                new StreamG("윤상한",2,1),
                new StreamG("윤상한",2,2),
                new StreamG("윤상한",2,2),
                new StreamG("윤상한",2,3),
                new StreamG("윤상한",2,3),
                new StreamG("윤상한",2,3),
                new StreamG("윤상한",2,2),
                new StreamG("윤상한",2,2),
                new StreamG("윤상한",2,2),

                new StreamG("윤상한",3,1),
                new StreamG("윤상한",3,2),
                new StreamG("윤상한",3,2),
                new StreamG("윤상한",3,3),
                new StreamG("윤상한",3,3),
                new StreamG("윤상한",3,1)
        );

        Map<Integer, Map<Integer, List<StreamG>>> integerListMap = streamGList.stream()
                .collect(Collectors.groupingBy(StreamG::getGrade,Collectors.groupingBy(StreamG::getBan)));

        integerListMap.entrySet()
                .forEach(
                        s->{
                            System.out.println(s.getValue().toString());
                            s.getValue().forEach((key, value) -> value.toString());
                        }
                );
    }
}

class StreamG
{
    private String name;
    private Integer ban;
    private Integer grade;

    public StreamG(String name, Integer grade, Integer ban)
    {
        this.name = name;
        this.ban = ban;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBan() {
        return ban;
    }

    public void setBan(Integer ban) {
        this.ban = ban;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "StreamG{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", grade=" + grade +
                '}';
    }
}