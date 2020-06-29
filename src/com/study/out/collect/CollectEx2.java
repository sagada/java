package com.study.out.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectEx2 {
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

        System.out.println();
        System.out.println("학생 이름만 뽑아서 List<String> 에 저장");
        // 학생 이름만 뽑아서 List<String> 에 저장
        List<String> names = Arrays.stream(stuArr).map(Student::getName).collect(Collectors.toList());
        System.out.println(names);

        System.out.println();
        System.out.println("array -> stream -> array");
        // array -> stream -> array
        Student [] stuArr2 = Arrays.stream(stuArr).toArray(Student[]::new);
        for(Student s : stuArr2)
        {
            System.out.println(s);
        }

        System.out.println();
        System.out.println("스트림을 Map<String, Student> 로 변환 학생 이름이 Key");
        // stream을 Map<String, Student> 로 변환 학생 이름이 Key
        Map<String, Student> stuMap = Arrays.stream(stuArr).collect(Collectors.toMap(Student::getName, s->s));
        for(String name : stuMap.keySet())
            System.out.println(name + " - " + stuMap.get(name));

        long count = Arrays.stream(stuArr).count();
        long totalScore = Arrays.stream(stuArr).mapToInt(Student::getTotalScore).sum();
        System.out.println("count : " + count);
        System.out.println("totalScore : " + totalScore);

        String stuNames = Arrays.stream(stuArr).map(Student::getName).collect(Collectors.joining(", "));;
        System.out.println("student names joining : " + stuNames);


    }
}
