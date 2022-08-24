package OOPS.program;

public class Lab342 {

	public static void main(String[] args) {
		
		Hello62 h=new Hello62();
		h.show();

	}

}

class Hai12{
	static int a=10;
}
class Hello62 extends Hai12{
	static int a=20;
	void show(){
		int a=30;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}