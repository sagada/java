package com.study.out.refactoriing.re8;

public class ShapeRectangle extends Shape{
    public ShapeRectangle(int _startx, int _starty, int _endx, int _endy)
    {
        super(_startx, _starty, _endx, _endy);
    }

    @Override
    public int getTypeCode()
    {
        return Shape.TYPECODE_RECTANGLE;
    }

    @Override
    public String getName()
    {
        return "RECTANGLE";
    }

    @Override
    public void draw()
    {
        System.out.println("drawRectAngle: " + this.toString());
    }
}
