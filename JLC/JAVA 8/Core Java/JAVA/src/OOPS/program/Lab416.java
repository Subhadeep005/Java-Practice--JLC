package OOPS.program;

//Multiple Inheritance

interface Inter7{
	void m1();
	int A=10;
}
interface Inter8{
	void m2();
	int B=11;
}
class Hello76 implements Inter7,Inter8{
	@Override
	public void m1() {
		System.out.println("Hello --> m1()");
	}
	@Override
	public void m2() {
		System.out.println("Hello --> m2()");
	}
}

public class Lab416 {

	public static void main(String[] args) {
		Hello76 h=new Hello76();
		System.out.println(h.A);
		System.out.println(h.B);
		h.m1();
		h.m2();
	}

}
