package OOPS.program;

public class Lab380 {

	public static void main(String[] args) {
		B21 bobj=new B21();
		bobj.m1();
	}

}
class A23{
	final void m1(){}
}
class B21 extends A23{
	void m1(){}
}