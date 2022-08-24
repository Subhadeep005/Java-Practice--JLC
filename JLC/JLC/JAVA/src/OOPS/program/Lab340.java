package OOPS.program;

public class Lab340 {

	public static void main(String[] args) {
		new C5();

	}

}
class A9{
	A9(){
		System.out.println("A -> D.C.");
	}
	static{
		System.out.println("A -> S.B.");
	}
	{
		System.out.println("A -> I.B.");
	}
}

class B8 extends A9{
	B8(){
		System.out.println("B -> D.C.");
	}
	static{
		System.out.println("B -> S.B.");
	}
	{
		System.out.println("B -> I.B.");
	}
}

class C5 extends B8{
	C5(){
		System.out.println("C -> D.C.");
	}
	static{
		System.out.println("C -> S.B.");
	}
	{
		System.out.println("C -> I.B.");
	}
}