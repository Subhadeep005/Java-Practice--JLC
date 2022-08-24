package OOPS.program;

public class Lab386 {

	public static void main(String[] args) {
		new B27().m1();
	}

}
class A29{
	protected void m1(){}
	protected void m2(){}
}
class B27 extends A29{
	private void m1(){}
	void m2(){}
	}