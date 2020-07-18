package com.study.out.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamEx8 {
    public static void main(String[] args) {

        List<Mock> mockList = Arrays.asList(
                new Mock("Z", 1),
                new Mock("Z", 1),
                new Mock("Z", 2),
                new Mock("B", 3),
                new Mock("B", 4),
                new Mock("G", 4),
                new Mock("H", 5),
                new Mock("D", 6),
                new Mock("E", 7),
                new Mock("F", 7)
                );

//        Mock.getDeleteMock(mockList);
        Mock.test(mockList);

    }
}

class Mock implements Comparable {
    private String wsCateCd;

    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    private int wmpCateCd;
    private STATUS status;

    public static void test(List<Mock> list)
    {
        Map<String, List<Mock>> test = list.stream().collect(Collectors.groupingBy(Mock::getWsCateCd));

        test.forEach((key, value) -> System.out.println(key + " / " + value));
    }
    public static void getDeleteMock(List<Mock> list)
    {
        Map<String, Long> map = list
                .stream()
                .collect(Collectors.groupingBy(Mock::getWsCateCd, Collectors.counting()));

        map.entrySet().stream().filter(s->s.getValue() < 2).forEach(System.out::println);

    }

    public String getWsCateCd() {
        return wsCateCd;
    }

    public void setWsCateCd(String wsCateCd) {
        this.wsCateCd = wsCateCd;
    }

    public int getWmpCateCd() {
        return wmpCateCd;
    }

    public void setWmpCateCd(int wmpCateCd) {
        this.wmpCateCd = wmpCateCd;
    }

    public Mock(String wsCateCd, int wmpCateCd) {
        this.wsCateCd = wsCateCd;
        this.wmpCateCd = wmpCateCd;
    }
    enum STATUS{
        DUPLICATE, WRONG_CATE
    }
    @Override
    public int compareTo(Object o) {
        Mock temp = (Mock)o;
        return this.getWsCateCd().compareToIgnoreCase(temp.getWsCateCd());
    }
}