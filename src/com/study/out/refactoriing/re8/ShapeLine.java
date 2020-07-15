package com.study.out.refactoriing.re8;

public class ShapeLine extends Shape{

    protected ShapeLine(int startx, int starty, int endx, int endy)
    {
        super(startx, starty, endx, endy);
    }

    public static ShapeLine createShapeLine(int sx, int sy, int ex, int ey)
    {
        return new ShapeLine(sx,sy,ex,ey);
    }

    @Override
    public int getTypeCode()
    {
        return Shape.TYPECODE_LINE;
    }

    @Override
    public String getName()
    {
        return "Line";
    }

    @Override
    public void draw()
    {
        System.out.println("drawLine : " + this.toString());
    }

}
