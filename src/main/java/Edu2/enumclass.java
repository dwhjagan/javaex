package Edu2;

/**
 * Created by janaidu on 21/12/2016.
 */

enum Direction {East, South, West, North}

public class enumclass {
    public static void main(String args[]) {
        Direction dir = Direction.West;

        switch (dir) {
            case South:
                System.out.println("south");
                break;
            case East:
                System.out.println("East");
                break;
            case West:
                System.out.println("West");
                break;
            case North:
                System.out.println("North.");
                break;
        }
    }
}