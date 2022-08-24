package OOPS.program;

public class Lab387 {

	public static void main(String[] args) {
		new B28().m1();
	}

}
class A30{
	protected void m1(){}
	protected void m2(){}
}
class B28 extends A30{
	protected void m1(){}
	public void m2(){}
	}