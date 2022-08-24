package OOPS.program;

public class Lab339 {

	public static void main(String[] args) {
		
		new C3();

	}

}
class A7{
	A7(){
		System.out.println("A -> D.C.");
	}
}
class B6 extends A7{
	B6(){
		System.out.println("B -> D.C");
	}
}
class C3 extends B6{
	C3(){
		System.out.println("C -> D.C.");
	}
}