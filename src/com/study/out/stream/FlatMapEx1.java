package com.study.out.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapEx1 {
    public static void main(String[] args) {
        String [] lineArr = {
                "Belive Me 지성 팍",
                "그렇게 소중한 여러분입니다.",
                "지상 누구보다 소중해요!"
        };

        Stream<String> lineStream = Arrays.stream(lineArr);
        Stream<String> strStream = lineStream.flatMap(line->Stream.of(line.split(" +")));
        strStream.forEach(System.out::println);

        System.out.println("---------------------------------------------------------------------");
        Stream<String[]> strArrStrm = Stream.of(
                new String[]{"abc","def","jkl"},
                new String[]{"ABC","DEF","JKL"}
        );

        Stream<String> stringStream = strArrStrm.flatMap(Arrays::stream);

        stringStream.map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("---------------------------------------------------------------------");


    }
}
