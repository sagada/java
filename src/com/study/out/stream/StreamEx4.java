package com.study.out.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx4 {

    public static void main(String[] args) {

        String[] arr ={
                "I Belibe 그댄 곁에 없지만안",
                "그댄만을 안아줄수 없겠죠",
                "아이 빌립 그댄 행복한기리를"
        };

        Stream<String> lineStream = Arrays.stream(arr);
        Stream<String> str = lineStream.flatMap(line->Stream.of(line.split(" +")));

        str.map(String::toUpperCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println("########################################################################################");

        Stream<String[]> strArrStrm = Stream.of(
                new String[]{"abc", "def", "jkl"},
                new String[]{"ABC", "DEF", "JKL"}
        );

        Stream<String> strStream = strArrStrm.flatMap(Arrays::stream);

        strStream.map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        String [] lineArr = {
                "Belive or not It is true",
                "Do or do not There is no try",
        };

        Stream<String> lineStream2 = Arrays.stream(lineArr);
//        lineStream2.forEach(System.out::println);
//
        Stream<String> f = lineStream2.flatMap(l -> Stream.of(l.split(" +")));
        f.forEach(System.out::println);


    }
}
