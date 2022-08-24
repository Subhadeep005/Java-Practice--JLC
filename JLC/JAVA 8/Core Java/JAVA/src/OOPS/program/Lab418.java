package OOPS.program;

class Hello78 implements Inter9,Inter10{
	@Override
	public void m1() {
		System.out.println("Hello --> m1()");
	}
	@Override
	public void m2() {
		System.out.println("Hello --> m2()");
	}
	@Override
	public void m3() {
		System.out.println("Hello --> m3()");
		System.out.println(A); //Ambiguous
		System.out.println(B);
		System.out.println(C);
	}
}

public class Lab418 {

	public static void main(String[] args) {
		Hello78 h=new Hello78();
		h.m1();  h.m2();  h.m3();
	}

}
