package OOPS.program;

public class Lab335 {

	public static void main(String[] args) {
		
		new Hello58();
	}

}

class Hai8{
	static int a=99;
	static{
		System.out.println("Hai ->S.B:"+a);
	}
}
class Hello58 extends Hai8{
	static int b=88;
	static{
		System.out.println("Hello -> S.B:"+a);
		System.out.println("Hello -> S.B:"+b);
	}
}