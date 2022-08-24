package OOPS.program;

public class Lab404 {

	public static void main(String[] args) {
		Shape5 sp=new Shape5();
		sp.area();
		}
	}
	abstract class Shape5{
		abstract void area();
	}
	class Square4 extends Shape5{
		void area() {
			System.out.println("square --> area()");
		}
	}