package com.study.out.optional;

import java.util.Optional;

public class OptionalEx1 {
    public static void main(String[] args) {

        String str = "abc";
        Optional<String> optVal = Optional.of(str);

        // optional 참조 변수 초기화
        Optional<String> em = Optional.<String>empty();

        // optional 값이 비었을 때 대체할 값을 반환하는 람다식을 지정 할 수 있는 orElseGet
        String test = em.orElseGet(()-> "비었습니다.....");
        System.out.println(test);

        String test2 = em.orElseGet(()-> "3am");
        System.out.println(test2);

//        em.orElseThrow(()->new IllegalArgumentException("비었으니 IllegalArgument Exception"));

        //optional 객체에 flatMap
        int result = Optional.of("123")
                .map(Integer::parseInt).orElse(-1);

        System.out.println("result = " + result);

        Optional<Integer> int1 = null;

        if(Optional.ofNullable(int1).isPresent())
        {
            System.out.println("있어");
        }
        else
        {
            System.out.println("없어");
        }

        Optional<Integer> int2 = Optional.<Integer>empty();

        if(Optional.of(int2).isPresent())
        {
            System.out.println("있어");
        }
        else
        {
            System.out.println("없어");
        }

        Optional<Integer> nullOpt = null;
        Optional.ofNullable(nullOpt).ifPresent(System.out::println);

        System.out.println("_____________________________________________________________________________");
        System.out.println("null 아닐 때만 출력 하기, null 이면 아무일 도 없다.");
        Optional.ofNullable(result).ifPresent(System.out::println);

    }
}
