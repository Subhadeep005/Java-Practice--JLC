package OOPS.program;

public class Lab346 {

	public static void main(String[] args) {
		new B13();

	}

}

class A14{
	A14(int a){
		System.out.println("A(int)Cons");
	}
}
class B13 extends A14{
	B13(){
		System.out.println("B ->D.C");
		super(10);// super must be the first statement.
	}
}