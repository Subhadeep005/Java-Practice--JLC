package OOPS.program;

public class Lab382 {

	public static void main(String[] args) {
		B23 bobj=new B23();
		bobj.m1();
		bobj.m2();
	}

}
class A25{
	void m1(){
		System.out.println("m1 in A");
	}
	static void m2(){
		System.out.println("m2 in A");
	}
}
class B23 extends A25{
	void m1(){
		System.out.println("m1 in B");
	}
	static void m2(){
		System.out.println("m2 in B");
	}
	}
