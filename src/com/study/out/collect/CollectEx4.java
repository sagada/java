package com.study.out.collect;

import java.util.*;
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

        map.keySet().forEach(System.out::println);

        Map<Student2.Level, List<Student2>> map2ByLevel = stuStream.stream()
                .collect(Collectors.groupingBy(s->{
                    if(s.getScore() >= 200)
                    {
                        return Student2.Level.HIGH;
                    }
                    else if(s.getScore() >= 100)
                    {
                        return Student2.Level.MID;
                    }
                    else {
                        return Student2.Level.LOW;
                    }
                }));

        TreeSet<Student2.Level> keySet = new TreeSet<>(map2ByLevel.keySet());

        for (Student2.Level level : keySet)
        {
            System.out.println("[" + level + "]");
            for (Student2 student2 : map2ByLevel.get(level))
            {
                System.out.println(student2);
            }
            System.out.println();
        }

        Map<Student2.Level, Long> stuCntByLevel = stuStream.stream()
                .collect(Collectors.groupingBy(
                                s->{
                                    if(s.getScore()>=200)
                                        return Student2.Level.HIGH;
                                    else if(s.getScore() >= 100)
                                        return Student2.Level.MID;
                                    else
                                        return  Student2.Level.LOW;
                                },Collectors.counting()
                ));

        System.out.printf("%n3. 단순 그룹화 + 통계(성적별 학생수)%n");
        for(Student2.Level key : stuCntByLevel.keySet())
        {
            System.out.printf("[%s] - %d 명, ", key, stuCntByLevel.get(key));
        }
        System.out.println();


    }
}

class Merger implements Comparator {

    private Integer c;

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    @Override
    public int compare(Object o1, Object o2) {

        if (o1 instanceof Comparable && o2 instanceof Comparable)
        {
            Comparable c1 = (Comparable)o1;
            Comparable c2 = (Comparable)o2;

            return c1.compareTo(c2) * -1;
        }

        return -1;
    }
}
