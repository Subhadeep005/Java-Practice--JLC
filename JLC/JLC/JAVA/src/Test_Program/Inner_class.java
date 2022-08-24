package Test_Program;

class Outer{
	int a=10;
	static int b=20;
	void m1(){
		System.out.println("Outer --> m1()");
		System.out.println(Inner.x);
		System.out.println(this.a);
		System.out.println(this.b);
		this.m2();
		this.m3();
	}
	static void m2(){
		System.out.println("Outer --> m2()");
	}
	void m3(){
		Inner inrob=new Inner();
		System.out.println("Outer --> m3()");
		System.out.println(inrob.y);
		System.out.println(inrob.x);
		System.out.println(Inner.x);
		inrob.display();
	}
	interface I{
		void display();
	}
//------> Instance Inner Class Start
	/*private*/ class Inner implements I{
		int y=99;
		final static int x=11;
		{
			System.out.println("*****Instance Inner class Start*****");
			System.out.println("Inner I.B");
			System.out.println(this.y);
			System.out.println(this.x);
		}
		Inner(){
			System.out.println("Inner D.C");
		}
		public void display(){
			System.out.println("Interface method display in instance Inner class");
		}
		void show(){
			System.out.println("Instance Inner --> show()");
			System.out.println(a);
			System.out.println(b);
			System.out.println(x);
			System.out.println(y);
			m1();
			m2();
			m3();
			System.out.println("*****Instance Inner class End*****");
		}
		//interface I{} //inside the instance inner class we cannot define the inner interfaces .
									//(Since the variables of interfaces are static declaration so it cannot be allowed )
class Inner2{}
}
//------> Instance Inner Class End

//------> Static Inner class Start
	static class Inner3{ //We can use private and abstract combination with inner class.
		int y=66;
		static int x=99;
		static void disp(){
			System.out.println("*****Static Inner class Start*****");
			System.out.println("Static Inner --> disp()");
			System.out.println(b);
			System.out.println(x);
			m2();
			new Inner4().display1();
			System.out.println("*****Static Inner class End*****");
		}
		interface I1{
			void display1();
		}
		static class Inner4 implements I1{
			public void display1() {
				System.out.println("Interface method display1 in Static Inner class");
			}
		}
	}
//------> Static Inner class End

}

class Test3 extends Outer.Inner3{
	void testm1(){
		System.out.println("Test class extends Outer.Inner3");
		System.out.println("Test class method");
		System.out.println(y);
		System.out.println(x);
		Outer.Inner3.disp();
	}
}

public class Inner_class {

	public static void main(String[] args) {
		Outer outob=new Outer();
		outob.m1();   outob.m2();   outob.m3();
		Outer.Inner inrob=new Outer().new Inner();
		inrob.show();
		Outer.Inner3.disp();
		Test3 test=new Test3();
		test.testm1();
	}

}
