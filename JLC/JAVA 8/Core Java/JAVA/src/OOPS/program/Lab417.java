package OOPS.program;

class Hello77 implements Inter9,Inter10{
	@Override
	public void m1() {
		System.out.println("Hello --> m1()");
	}
	@Override
	public void m2() {
		System.out.println("Hello --> m2()"); //Only one time override is needed.
	}
	@Override
	public void m3() {
		System.out.println("Hello --> m3()");
		System.out.println(B);
		System.out.println(C);
	}
}

public class Lab417 {

	public static void main(String[] args) {
		Hello77 h=new Hello77();
		h.m1();  h.m2();  h.m3();
	}

}
