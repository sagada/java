package com.study.out.funtionalInterface;

import java.util.Objects;
import java.util.function.*;

public class FInterfaceCompose {
    public static void main(String[] args) {
        Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);
        Function<Integer, String> g = Integer::toBinaryString;

        Function<String, String> h =f.andThen(g);
        Function<Integer, Integer> h2 = f.compose(g);

        System.out.println(h.apply("FF"));  // "FF" -> 255 -> "11111111"
        System.out.println(h2.apply(2)); // 2 -> "10" -> 16

        Function<String, String> f2 = x->x; // 항등 함수
        System.out.println(f2.apply("AAA"));

        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i % 2 == 0;
        Predicate<Integer> notP = p.negate(); // i >= 100

        Predicate<Integer> all = notP.or(r);
        System.out.println(all.test(150));

        String str1 = "abc";
        String str2 = "abc";

        Predicate<String> p2 = Predicate.isEqual(str1);
        boolean test = p2.test(str2);
        System.out.println(test);

        int IS_END_TIME = 24;
        Predicate<Integer> it = Predicate.isEqual(IS_END_TIME);

        System.out.println(it.test(24));
        System.out.println(it.test(123));

        Function<String,Integer> stringIntegerFunction = Integer::parseInt;
        int intValue = stringIntegerFunction.apply("1234");
        System.out.println(intValue);

        BiFunction<String, String, Boolean> fbi = String::equals;

        ObjecTest test1  = new ObjecTest();
        Function<String, Integer> st = test1::testObj;
        System.out.println(st.apply("1234"));

        System.out.println("static method reference");
        Function<String, String> stringStringFunction = ObjecTest::test;
        String yun = stringStringFunction.apply("윤종신");
        System.out.println(yun);

        Function<String,String> xxxx = ObjecTest::test;
        System.out.println(xxxx.apply("DDDD"));
    }
}
class ObjecTest
{
    private String name;

    public static String test(String name){
        return name + "..... 너에게 간다.....";
    }

    public int testObj(String name)
    {
        return Integer.parseInt(name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}