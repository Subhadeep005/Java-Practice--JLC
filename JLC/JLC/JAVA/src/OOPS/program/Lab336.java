package OOPS.program;

public class Lab336 {

	public static void main(String[] args) {
		new Hello59();
	}

}

class Hai9{
	static int a=99;
	{
		System.out.println("Hai ->I.B:"+a);
	}
}
class Hello59 extends Hai9{
	static int b=88;
	{
		System.out.println("Hello -> I.B:"+a);
		System.out.println("Hello -> I.B:"+b);
	}
}