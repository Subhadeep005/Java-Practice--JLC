package OOPS.program;

public class Lab340A {

	public static void main(String[] args) {
		new B9();
		new C6();

	}

}
class A10{
	A10(){
		System.out.println("A -> D.C.");
	}
	static{
		System.out.println("A -> S.B.");
	}
	{
		System.out.println("A -> I.B.");
	}
}

class B9 extends A10{
	B9(){
		System.out.println("B -> D.C.");
	}
	static{
		System.out.println("B -> S.B.");
	}
	{
		System.out.println("B -> I.B.");
	}
}

class C6 extends A10{
	C6(){
		System.out.println("C -> D.C.");
	}
	static{
		System.out.println("C -> S.B.");
	}
	{
		System.out.println("C -> I.B.");
	}
}