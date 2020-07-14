package com.study.out.refactoriing.re8;

public abstract class ShapeFactory {
    public abstract Shape create(int sy, int sx, int ey, int ex);

    public static class LineFactory extends ShapeFactory
    {
        private static final ShapeFactory facory = new LineFactory();

        private LineFactory()
        {

        }

        public static ShapeFactory getInstance()
        {
            return facory;
        }

        public Shape create(int sx, int sy, int ex, int ey)
        {
            return new ShapeLine(sy, sx, ey, ex);
        }
    }


    public static class RectangleFactory extends ShapeFactory
    {
        private static final ShapeFactory facory = new LineFactory();

        private RectangleFactory()
        {

        }

        public static ShapeFactory getInstance()
        {
            return facory;
        }

        public Shape create(int sx, int sy, int ex, int ey)
        {
            return new ShapeRectangle(sy, sx, ey, ex);
        }
    }


    public static class OvalFactory extends ShapeFactory
    {
        private static final ShapeFactory facory = new LineFactory();

        private OvalFactory()
        {

        }

        public static ShapeFactory getInstance()
        {
            return facory;
        }

        public Shape create(int sx, int sy, int ex, int ey)
        {
            return new ShapeOval(sy, sx, ey, ex);
        }
    }
}
