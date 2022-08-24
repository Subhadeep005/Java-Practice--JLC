package OOPS.program;

public class Lab345 {

	public static void main(String[] args) {
		new B12();

	}

}

class A13{
	A13(int a){
		System.out.println("A(int)Cons");
		//System.out.println(a);
	}
}
class B12 extends A13{
	B12(){
		super(10);
		System.out.println("B ->D.C");
	}
}