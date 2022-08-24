package OOPS.program;

class Outer3{
	int a=10;
	static int b=20;
	void show(){
		System.out.println("Outer --> show() Begin");
		class Inner{
			void m1(){
				System.out.println(a);
				System.out.println(b);
			}
		}
		new Inner().m1();
		System.out.println("Outer --> show() End");
	}
}

public class Lab438 {

	public static void main(String[] args) {
		Outer3 outob=new Outer3();
		outob.show();
	}

}
