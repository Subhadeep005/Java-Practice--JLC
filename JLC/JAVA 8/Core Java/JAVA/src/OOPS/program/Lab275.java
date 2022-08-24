package OOPS.program;

public class Lab275 {

	public static void main(String[] args) {
		Hello12 h=null;
		h.show();
		h=new Hello12();
		h.show();
		Hello12.show();
		new Hello12().show();
	}

}

class Hello12{
	static void show(){
		System.out.println("Instance show()");
	}
}