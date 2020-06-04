package com.wmp.out.javas;

enum Direction {
    EAST(1,"동"),
    SOUTH(5,"북"),
    WEST(-1,"서"),
    NORTH(10,"남");
    private final int value;
    private final String korean;
    Direction(int value, String korean)
    {
        this.value = value;
        this.korean = korean;
    }
    int getValue() {return value;}
}

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

        switch (d1)
        {
            case EAST:
                System.out.println("EAST!~!");   break;
            case SOUTH:
                System.out.println("SOUTH!~!"); break;
            case WEST:
                System.out.println("WEST!~!");  break;
            case NORTH:
                System.out.println("NORTH!~!"); break;
            default:
                System.out.println("Invalid direction !");break;
        }


        Direction[] arr = Direction.values();

        for(Direction d : arr)
            System.out.printf("%s = %d%n", d.name(),d.ordinal());
    }
}
