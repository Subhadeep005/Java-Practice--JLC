package OOPS.program;

public class Lab390 {

	public static void main(String[] args) {
		B31 bobj=new B31();
		bobj.m1();
	}

}
class A33{
	void m1(){
		System.out.println("A --> m1");
	}
}
class B31 extends A33{
	void m1(){
		System.out.println("B --> m1");
	}
	}