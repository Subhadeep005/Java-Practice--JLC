package OOPS.program;

class Hello79 implements Inter9,Inter10{
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
		System.out.println(Inter9.A);
		System.out.println(Inter10.A);
		System.out.println(B);
		System.out.println(C);
	}
}

public class Lab419 {

	public static void main(String[] args) {
		Hello79 h=new Hello79();
		h.m1();  h.m2();  h.m3();
	}

}
