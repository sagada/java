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

        String[] lineArr2 = {
                "Believe or not It is true",
                "Do or do not There is no try"
        };

        Stream<String> lineStream2 = Arrays.stream(lineArr2);
        lineStream2.flatMap(line-> Stream.of(line.split(" +")))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println("---------------------------------------------------------------------");

        Stream<String> strStrm1 = Stream.of("AAA","ABC","bBb","Dd");
        Stream<String> strStrm2 = Stream.of("bbb","aaa","ccc","dd");
        Stream<Stream<String>> streamStream = Stream.of(strStrm1,strStrm2);
        Stream<String> stringStream1 = streamStream
                                        .map(s->s.toArray(String[] ::new))
                                        .flatMap(Arrays::stream);
        stringStream1.forEach(System.out::println);
    }
}
