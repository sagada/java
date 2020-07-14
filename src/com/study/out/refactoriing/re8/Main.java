package com.study.out.refactoriing.re8;

public class Main {
    public static void main(String[] args) {
        Shape line = Shape.createShape(ShapeFactory.LineFactory.getInstance(),3,4,5,6);

    }
}
