package com.study.out.ch7;

@FunctionalInterface
interface InterfaceClassTest {
    void add();
}

class FunctionalInterFace{

    static void execute(InterfaceClassTest f){
        f.add();
    }

    static InterfaceClassTest getMyInterFaceClassTest(){
        InterfaceClassTest f = ()-> System.out.println("f3.run()");
        return f;
    }

    public static void main(String[] args) {
        InterfaceClassTest f1 = () -> System.out.println("화난 미소와 함께 서있는 그래 너는 푸른 바다야~~");
        InterfaceClassTest f2 = new InterfaceClassTest() {
            public void add() {
                System.out.println("f2 call");
            }
        };

        f1.add();
        f2.add();
        execute(f1);
        execute(()-> System.out.println("얼마 줄거니"));
    }
}
