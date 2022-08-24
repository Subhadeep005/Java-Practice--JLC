package OOPS.program;

class Hello80 implements Inter9,Inter10{
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

public class Lab420 {

	public static void main(String[] args) {
		Hello80 h=new Hello80();
		Inter9 ref1=h;
		ref1.m1();
		ref1.m2();
		
		Inter10 ref2=h;
		ref2.m2();
		ref2.m3();
	}

}
