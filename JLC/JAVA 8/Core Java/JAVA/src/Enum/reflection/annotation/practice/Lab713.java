package Enum.reflection.annotation.practice;

public class Lab713 {

	public static void main(String[] args) {
		Direction3 d=Direction3.EAST;
		switch (d) {
		case EAST:
			System.out.println("East Direction selected");
			break;
		case NORTH:
			System.out.println("North Direction selected");
			break;
		case WEST:
			System.out.println("West Direction selected");
			break;
		case SOUTH:
			System.out.println("South Direction selected");
			break;
		}
	}

}
enum Direction3{
	EAST, NORTH, WEST, SOUTH;
}
