package OOPS.program;

public class Lab339A {

	public static void main(String[] args) {
		new B7();
		new C4();

	}

}
class A8{
	A8(){
		System.out.println("A -> D.C.");
	}
}
class B7 extends A8{
	B7(){
		System.out.println("B -> D.C");
	}
}
class C4 extends A8{
	C4(){
		System.out.println("C -> D.C.");
	}
}