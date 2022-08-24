package OOPS.program;

public class Lab375 {

	public static void main(String[] args) {
		B16 bobj=new B16();
		bobj.show(99);
		bobj.show("JLC");
	}

}
class A18{
	void show(int ab){
		System.out.println("A --> show(int)");
	}
}
class B16 extends A18{
	void show(String ab){
		System.out.println("B --> show(String)");
	}
}