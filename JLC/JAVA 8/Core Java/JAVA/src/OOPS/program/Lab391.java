package OOPS.program;

public class Lab391 {

	public static void main(String[] args) {
		B32 bobj=new B32();
		bobj.m1();
	}

}
class A34{
	void m1(){
		System.out.println("A --> m1");
	}
}
class B32 extends A34{
	void m1(){
		System.out.println("B --> m1");
		super.m1();
	}
	}