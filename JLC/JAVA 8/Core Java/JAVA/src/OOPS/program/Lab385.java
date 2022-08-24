package OOPS.program;

public class Lab385 {

	public static void main(String[] args) {
		B26 bobj=new B26();
		bobj.m1();
		bobj.m2();
		bobj.m3();
		
	}

}
class A28{
	void m1(){}
	void m2(){}
	void m3(){}
}
class B26 extends A28{
	void m1(){}
	protected void m2(){}
	public void m3(){}
	}
