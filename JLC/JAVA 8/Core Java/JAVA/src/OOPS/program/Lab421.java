package OOPS.program;

interface Inter11{
	void show();
}
class A37{
	public void show(){
		System.out.println("A --> show()");
	}
}
class B35 extends A37 implements Inter11 {}

public class Lab421 {

	public static void main(String[] args) {
		B35 ref=new B35();
		ref.show();
	}

}
