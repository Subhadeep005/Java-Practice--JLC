package OOPS.program;

public class Lab392 {

	public final  static void main(String[] args) {
		B33 bobj=new B33();
		bobj.m1();
	}

}
class A35{
	static void m1(){
		System.out.println("A --> m1");
	}
}
class B33 extends A35{
	static void m1(){
		System.out.println("B --> m1");
	}
	}