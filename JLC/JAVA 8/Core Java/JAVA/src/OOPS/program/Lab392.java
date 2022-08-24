package OOPS.program;

public class Lab392 {

	public static void main(String[] args) {
		B33 bobj=new B33();
		bobj.m1();
		bobj.m2();
		A35 aobj = new B33();
		//aobj.m1();
	}

}
class A35{
	static void m1(){
		System.out.println("A --> m1");
	}
}
class B33 extends A35{
	//@Override
	static void m1(){
		A35.m1();
		System.out.println("B --> m1");
	}
	void m2(){
		super.m1();
	}
}