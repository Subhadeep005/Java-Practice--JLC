class Outer{
	int a=10;
	static int b=20;
	void m1(){
		System.out.println("Outer --> m1()");
	}
	static void m2(){
		System.out.println("Outer --> m2()");
	}
	class Inner{
		int y=99;
		final static int x=11;
		{
			System.out.println("Inner I.B");
		}
		void show(){
			System.out.println("Inner --> show()");
			System.out.println(a);
			System.out.println(b);
			System.out.println(x);
			m1();
			m2();
		}
		class Inner2{}
	}
	void m3(){
		Inner inrob=new Inner();
		System.out.println("Outer --> m3()");
		System.out.println(inrob.y);
		System.out.println(inrob.x);
		System.out.println(Inner.x);
		inrob.show();
	}
}

public class Lab434 {

	public static void main(String[] args) {
		Outer outob=new Outer();
		outob.m1();   outob.m2();   outob.m3();
		Outer.Inner inrob=new Outer().new Inner();
		inrob.show();
	}

}
