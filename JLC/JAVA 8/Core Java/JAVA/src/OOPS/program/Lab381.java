package OOPS.program;

public class Lab381 {

	public static void main(String[] args) {
		B22 bobj=new B22();
		bobj.m1();
	}

}
class A24{
	void m1(){}
}
class B22 extends A24{
	final void m1(){}
}
