package OOPS.program;

public class Lab401 {

	public static void main(String[] args) {
		Shape2 sp=new Shape2();
		sp.area();
		}
	}
	class Shape2{
		abstract void area();
	}
	class Square2 extends Shape2{}