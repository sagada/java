package com.study.out.iostream;

public class IoStreamEx1 {
    public static void main(String[] args) {
        CU godCUPANG = new CU();
        godCUPANG.re();
    }
}

class CU extends Q
{
    @Override
    int re() {
        System.out.println("갓 쿠");
        return 1;
    }
}
abstract class Q{
    abstract int re();

    int re(int a, int b, int c){
        System.out.println("갓팡");
        return 1;
    }
}