package com.wmp.out.stream;

import java.util.*;

public class StreamTest {
    public static void main(String[] args) {
        List<Student> s = new ArrayList<>();

        s.add(new Student("키워드1", 3, 300));
        s.add(new Student("키워드2", 3, 400));
        s.add(new Student("키워드3", 3, 300));
        s.add(new Student("키워드1", 3, 300));
        s.add(new Student("키워드2", 3, 300));
        s.add(new Student("키워드1", 3, 300));
        s.add(new Student("키워드5", 3, 300));
        s.add(new Student("키워드4", 3, 300));
        s.add(new Student("키워드4", 3, 300));

        Map<String, Integer> map = new HashMap<>();

        s.forEach(e-> {
            if (map.containsKey(e.getName())) {
                map.put(e.getName(), 1);
            } else {
                map.put(e.getName(), map.get(e.getName()) + 1);
            }
        });

        Set<Student> set = new HashSet<>();
        Set<Student> set2 = new HashSet<>();

        s.stream().filter(e->map.get(e.getName()) == 1).forEach(set::add);
        s.stream().filter(e->map.get(e.getName()) != 1).forEach(set2::add);

        set.forEach(e-> System.out.println(e.getName()));
        System.out.println("중복");
        set2.forEach(e-> System.out.println(e.getName()));
//        map.forEach((name, count) -> {
//            System.out.println(name + " / " + count);
//        });
    }
}

class Student  {
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

//    @Override
//    public int compareTo(Student o) {
//        return o.getName().compareToIgnoreCase(this.getName());
//    }
}
