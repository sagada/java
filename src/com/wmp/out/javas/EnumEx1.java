package com.wmp.out.javas;

enum Direction {EAST, SOUTH, WEST, NORTH}

public class EnumEx1 {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.SOUTH;
        Direction d3 = Direction.WEST;
        Direction d4 = Direction.NORTH;
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        System.out.println("d1 == d2 ?" +  (d1 == d2));
        System.out.println("d1 == d3 ?" +  (d1 == d3));
        System.out.println("d1.equals(d3) ? " + d1.equals(d3));
//        System.out.println("d1 > d3 ?" + (d1> d3));
        System.out.println("d1.compareTo(d3) ? " + d1.compareTo(d2));

    }
}
