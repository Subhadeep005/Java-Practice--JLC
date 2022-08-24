package OOPS.program;

public class Lab329 {

	public static void main(String[] args) {
		B1 bobj=new B1();
		bobj.m1();
		bobj.m2();
		
		C1 cobj=new C1();
		cobj.m1();
		cobj.m3();

	}

}

class A1{
	void m1(){
		System.out.println("A -> m1");
	}
}
class B1 extends A1{
	void m2(){
		System.out.println("B -> m2");
	}
}
class C1 extends A1{
	void m3(){
		System.out.println("C -> m3");
	}
}