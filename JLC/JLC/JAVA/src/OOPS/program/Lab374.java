package OOPS.program;
public class Lab374 {

	public static void main(String[] args) {
		B15 bobj=new B15();
		bobj.show();
		bobj.SHOW();
	}
}
class A17{
	void show(){
		System.out.println("A --> show()");
	}
}
class B15 extends A17{
	void SHOW(){
		System.out.println("B --> SHOW()");
	}
}
