package com.study.out.stream;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.ToIntBiFunction;

public class MethodReferenceEx1 {
    public static void main(String[] args) {

        /*
         1) 정적 메소드 참조 할 경우
             --> 클래스 :: 메서드
         2) 인스턴스 메서드 참조 할 경우
             -->참조변수 :: 메서드
        */

        IntBinaryOperator operator;

        // 정적 메소드 참조
        operator = (x , y) -> CalCulator.staticMethod(x,y);

        System.out.println("결과 1 : " + operator.applyAsInt(1,2));

        operator = CalCulator::staticMethod;

        System.out.println("결과 2 : " + operator.applyAsInt(3,4));

        //인스턴스 메서드 참조
        CalCulator obj = new CalCulator();

        operator = (x, y) -> obj.instanceMethod(x,y);

        System.out.println("결과 3 : " + operator.applyAsInt(5,6));

        operator = obj::instanceMethod;
        System.out.println("결과 4 : " + operator.applyAsInt(7,8));

        ToIntBiFunction<String, String> function;

        function = (a,b) -> a.compareToIgnoreCase(b);
        print(function.applyAsInt("Java8","JAVA8"));

        function = String::compareToIgnoreCase;
        print(function.applyAsInt("Java8","JAVA8"));


        // 생성자 오버로딩
        Function<String, Member> function1 = Member::new;
        Member member1 = function1.apply("angel");

        BiFunction<String,String,Member> function2 = Member::new;
        Member member2 = function2.apply("angel1","플라이투더스카이");

        System.out.println("member1 :" + member1.getId());

        System.out.println("member2 :" + member2.getId());

    }

    public static void print(int order)
    {
        if (order < 0)
        {
            System.out.println("사전순으로 먼저 옵니다");
        }
        else if(order == 0)
        {
            System.out.println("동일한 문자열 입니다.");
        }
        else
        {
            System.out.println("사전 순으로 나중에 옵니다.");
        }
    }
}

class CalCulator{
    public static int staticMethod(int x, int y)
    {
        return x + y;
    }

    public int instanceMethod(int x, int y)
    {
        return x + y;
    }
}

class Member{
    private String name;
    private String id;

    public Member(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Member(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

