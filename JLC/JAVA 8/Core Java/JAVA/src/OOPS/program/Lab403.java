package OOPS.program;

public class Lab403 {

	public static void main(String[] args) {
		Shape4 sp=new Shape4();
		sp.area();
		}
	}
	abstract class Shape4{
		abstract void area();
	}
	class Square3 extends Shape4{}
