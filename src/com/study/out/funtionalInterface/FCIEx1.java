package com.study.out.funtionalInterface;

public class FCIEx1 {

    public static void main(String[] args) {

        MyFunctionalInterface my = () -> System.out.println("e");

        my.method();

        MyFunctionalInterface my2 = ()->{
            String str = "다시 여기 바닷가";
            System.out.println(str);
        };

        my2.method();

        MyFunInter2 f2 = System.out::println;
        MyFunInter2 f3 = x-> System.out.println(x + 3);

        f2.method(3);
        f3.method(4);

        MyFunInter2 f4 = x->System.out.println(x * 5);

        f4.method(10);

        System.out.println("리턴 값이 있는 인터페이스 구현");
        MyFunWithReturn f5 = (x, y) -> x + y;
        System.out.println(f5.mehtod(3,4));


        System.out.println("This 참조 테스트");

        UsingThis usingThis = new UsingThis();
        UsingThis.Inner inner = usingThis.new Inner();
        inner.method();
    }
}
