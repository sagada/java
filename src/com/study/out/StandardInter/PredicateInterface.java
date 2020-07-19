package com.study.out.StandardInter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterface {

    private static List<Names> list = Arrays.asList(
            new Names("홍길동", "M", 67),
            new Names("홍길동", "M", 32),
            new Names("홍길동", "M", 86),
            new Names("홍길동", "W", 90),
            new Names("홍길동", "W", 78),
            new Names("홍길동", "W", 76),
            new Names("홍길동", "M", 98)
    );

    public static double avg(Predicate<Names> predicate)
    {
        int count = 0, sum = 0;
        for (Names name : list)
        {
            if (predicate.test(name))
            {
                count++;
                sum += name.getScore();
            }
        }

        return (double) sum / list.size();
    }

    public static void main(String[] args) {
        double maleAvg = avg(s->s.getSex().equals("M"));
        System.out.println("male AVG : " + maleAvg);

        double womanAvg = avg(s->s.getSex().equals("W"));
        System.out.println("woman AVG : " + womanAvg);
    }
}

class Names {
    private String name;
    private String sex;
    private int score;

    public Names(String name, String sex, int score) {
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}