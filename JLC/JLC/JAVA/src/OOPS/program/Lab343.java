package OOPS.program;

public class Lab343 {

	public static void main(String[] args) {
		Hello63 h=new Hello63();
		h.show();

	}

}

class Hai13{
	static int a=10;
}
class Hello63 extends Hai13{
	static int a=20;
	static void show(){
		int a=30;
		System.out.println(a);
		//System.out.println(this.a);
		//System.out.println(super.a);
		System.out.println(Hello63.a);
		System.out.println(Hai13.a);
	}
}