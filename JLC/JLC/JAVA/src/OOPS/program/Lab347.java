package OOPS.program;

public class Lab347 {

	public static void main(String[] args) {
		new B14(10);

	}

}

class A15{
	A15(){
		System.out.println("A -> D.C");
	}
}
class B14 extends A15{
	B14(){
		System.out.println("B ->D.C");
	}
	B14(int a){
		this();
		System.out.println("B (int)");
	}
}