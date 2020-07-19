package com.study.out.StandardInter;

@FunctionalInterface
interface TestFucn
{
    void my();
}
class Outer{
    int val = 10; //InterEx1.this.val
    class Inner {
        int val = 20; //this.val

        void method(int i){
            int val = 30; //final int val = 30;
            // i = 10 ; i는 상수로 간주되어서 안됨

            TestFucn f = ()->{
                System.out.println("             i :  " + i);
                System.out.println("         value :  " + val);
                System.out.println("    this.value :  " + this.val);
                System.out.println("Outer.this.val : " + Outer.this.val);
            };

            f.my();
        }
    }
}

public class InterEx1 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method(100);
    }
}
