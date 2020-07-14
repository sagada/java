package com.study.out.refactoriing.re8;

public class ShapeLine extends Shape{

    protected ShapeLine(int startx, int starty, int endx, int endy)
    {
        super(startx, starty, endx, endy);
    }

    @Override
    public int getTypeCode() {
        return Shape.TYPECODE_LINE;
    }

    @Override
    public String getName() {
        return "Line";
    }

    @Override
    public void draw() {
        System.out.println("drawLine : " + this.toString());
    }


}
