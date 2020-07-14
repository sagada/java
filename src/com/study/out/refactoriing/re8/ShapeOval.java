package com.study.out.refactoriing.re8;

public class ShapeOval extends Shape{

    public ShapeOval(int _startx, int _starty, int _endx, int _endy)
    {
        super(_startx, _starty, _endx, _endy);
    }

    @Override
    public int getTypeCode()
    {
        return Shape.TYPECODE_OVAL;
    }

    @Override
    public String getName()
    {
        return "OVAL";
    }

    @Override
    public void draw()
    {
        System.out.println("drawOval : " + this.toString());
    }
}
