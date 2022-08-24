package OOPS.program;

public class Lab340B {

	public static void main(String[] args) {
		new C7();

	}

}
class A11{
	int a=11;
	static int b=22;
	A11(){
		int c=33;
		System.out.println("A -> D.C.");
		System.out.println("A -> D.C:"+a);
		System.out.println("A -> D.C."+b);
		System.out.println("A -> D.C."+c);
	}
	static{
		int c=44;
		System.out.println("A -> S.B.");
		//System.out.println("A -> S.B:"+a); //static Block cannot access instance variable.
		System.out.println("A -> S.B:"+b);
		System.out.println("A -> S.B:"+c);
	}
	{
		int c=55;
		System.out.println("A -> I.B.");
		System.out.println("A -> I.B:"+a);
		System.out.println("A -> I.B:"+b);
		System.out.println("A -> I.B:"+c);
	}
}

class B10 extends A11{
	int a=11;
	static int b=22;
	B10(){
		int c=66;
		System.out.println("B -> D.C.");
		System.out.println("B -> D.C:"+a);
		System.out.println("B -> D.C."+b);
		System.out.println("B -> D.C."+c);
	}
	static{
		int c=77;
		System.out.println("B -> S.B.");
		//System.out.println("B -> S.B:"+a); //static Block cannot access instance variable.
		System.out.println("B -> S.B:"+b);
		System.out.println("B -> S.B:"+c);
	}
	{
		int c=88;
		System.out.println("B -> I.B.");
		System.out.println("B -> I.B:"+a);
		System.out.println("B -> I.B:"+b);
		System.out.println("B -> I.B:"+c);
	}
}

class C7 extends B10{
	int a=11;
	static int b=22;
	C7(){
		int c=99;
		System.out.println("C -> D.C.");
		System.out.println("C -> D.C:"+a);
		System.out.println("C -> D.C."+b);
		System.out.println("C -> D.C."+c);
	}
	static{
		int c=111;
		System.out.println("C -> S.B.");
		//System.out.println("C -> S.B:"+a); //static Block cannot access instance variable.
		System.out.println("C -> S.B:"+b);
		System.out.println("C -> S.B:"+c);
	}
	{
		int c=222;
		System.out.println("C -> I.B.");
		System.out.println("C -> I.B:"+a);
		System.out.println("C -> I.B:"+b);
		System.out.println("C -> I.B:"+c);
	}
}