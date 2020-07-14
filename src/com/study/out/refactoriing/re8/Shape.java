package com.study.out.refactoriing.re8;

public abstract class Shape {

    public static final int TYPECODE_LINE = 0;
    public static final int TYPECODE_RECTANGLE = 1;
    public static final int TYPECODE_OVAL = 2;

    private final int _startx;
    private final int _starty;
    private final int _endx;
    private final int _endy;

    public Shape(int _startx, int _starty, int _endx, int _endy)
    {
        this._startx = _startx;
        this._starty = _starty;
        this._endx = _endx;
        this._endy = _endy;
    }

    public static Shape createShape(ShapeFactory factory, int _startx, int _starty, int _endx, int _endy)
    {
        return factory.create(_starty, _startx, _endx,_endy);
    }

    public abstract int getTypeCode();
    public abstract String getName();
    public abstract void draw();
    @Override
    public String toString()
    {
        return "Shape{" +
                ", _startx=" + _startx +
                ", _starty=" + _starty +
                ", _endx=" + _endx +
                ", _endy=" + _endy +
                '}';
    }
}
