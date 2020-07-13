package com.study.out.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectEx4 {
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

        Map<Integer, List<Student2>> map = stuStream.stream()
                .collect(Collectors.groupingBy(Student2::getBan));

        map.entrySet().stream().map(Map.Entry::getKey).forEach(System.out::println);


    }
}
