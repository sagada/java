package com.study.out.StandardInter;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class ConsumerInterface {
    public static void main(String[] args) {

        System.out.println("Consumer<String> Test");
        Consumer<String> consumer = System.out::println;
        consumer.accept("난 너를 사랑해 ~");

        System.out.println();

        System.out.println("IntConsumer Test");
        IntConsumer intConsumer = (i) -> System.out.println(i + 10);
        intConsumer.accept(10);

        System.out.println();

        System.out.println("Consumer<Object> Test");
        Consumer<List<ConsumerTest>> s = (consumerTest) ->{
            consumerTest.forEach(t->{
                System.out.println("ban : " + t.getBan());
                System.out.println("name : "+ t.getName());
            });
        };

        s.accept(Arrays.asList(
                new ConsumerTest(1,"일반"),
                new ConsumerTest(2,"이반"),
                new ConsumerTest(3,"삼반")));

        System.out.println();

        System.out.println("BiConsumer Test");
        BiConsumer<String, String> stringBiConsumer = (a,b)->{
            System.out.println("전자 : " + a);
            System.out.println("후자 : " + b);
        };

        stringBiConsumer.accept("전자 테스트", "후자 테스트");

        System.out.println();


        System.out.println("ObjDoubleConsumer Test");
        ObjDoubleConsumer<ConsumerTest> objDoubleConsumer = (con, val)->{
            System.out.println(con.getBan() + val);
        };

        objDoubleConsumer.accept(new ConsumerTest(1, "난너를 사랑해"), 10L);
        System.out.println();

        System.out.println("DoubleConsumer Test");
        DoubleConsumer doubleConsumer = System.out::println;
        doubleConsumer.accept(10L);
        System.out.println();






    }
}
class ConsumerTest{
    int ban;
    String name;

    public ConsumerTest(int ban, String name) {
        this.ban = ban;
        this.name = name;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
