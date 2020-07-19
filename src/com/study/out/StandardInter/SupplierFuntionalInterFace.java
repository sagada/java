package com.study.out.StandardInter;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierFuntionalInterFace {
    public static void main(String[] args) {

        System.out.println("Supplier<String> Test");

        Supplier<String> supplierWithString = () -> "니 맘을 뺏을 수 없어";
        System.out.println(supplierWithString.get());

        System.out.println();
        System.out.println("IntSupplier Test");

        IntSupplier intSupplier = ()->{
            int num = (int)(Math.random() * 6) + 1;
            return num;
        };
        System.out.println(intSupplier.getAsInt());

        System.out.println();


    }

    public static String Test(Supplier<String> t)
    {
        return t.get();
    }
}
