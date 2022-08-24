package OOPS.program;

public class Lab344 {

	public static void main(String[] args) {

		new B11();

	}

}

class A12{
	A12(int a){
		System.out.println("A(int)Cons");
	}
}
class B11 extends A12{
	B11(){
		super(); //constructor A12 in class A12 cannot be applied to given types;
		System.out.println("B ->D.C");
	}
}