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

        System.out.printf("%n4. 다중 분할 (성별 불합격자, 100점 이하) %n");
        Map<Boolean, Map<Boolean, List<Student2>>> failedStuBySex =
                stuStream
                        .stream()
                        .collect(Collectors.partitioningBy(Student2::isMale,
                                Collectors.partitioningBy(s->s.getScore() <= 100)));

        List<Student2> failedMaleStu = failedStuBySex.get(true).get(true);
        List<Student2> successMaleStu = failedStuBySex.get(true).get(false);
        List<Student2> failedFemaleStu = failedStuBySex.get(false).get(true);

        System.out.println("불합격 한 남자들");
        for(Student2 s : failedMaleStu)
            System.out.println(s);
        System.out.println("불합격 한 여자들");
        for(Student2 s :failedFemaleStu)
            System.out.println(s);
        System.out.println("합격한 남자들");
        for(Student2 s : successMaleStu)
            System.out.println(s);


    }
}
