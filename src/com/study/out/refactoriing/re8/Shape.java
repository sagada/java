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

    public static Shape createShape(int typeCode, int _startx, int _starty, int _endx, int _endy)
    {
        switch (typeCode)
        {
            case TYPECODE_LINE:
                return new ShapeLine(_startx, _starty, _endx, _endy);
            case TYPECODE_RECTANGLE:
                return new ShapeRectangle(_startx, _starty, _endx, _endy);
            case TYPECODE_OVAL:
                return new ShapeOval(_startx, _starty, _endx, _endy);
            default:
                return null;
        }
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
