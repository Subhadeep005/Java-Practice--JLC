package OOPS.program;

public class Lab341 {

	public static void main(String[] args) {
		
		Hello61 h=new Hello61();
		h.show();

	}

}

class Hai11{
	int a=10;
}
class Hello61 extends Hai11{
	int a=20;
	void show(){
		int a=30;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}