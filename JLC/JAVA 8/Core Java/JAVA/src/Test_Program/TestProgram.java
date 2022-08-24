package Test_Program;

public class TestProgram {

	public static void main(String[] args) {
		A aobj=new A();
		A aobj1=new B();
		B bobj = new B();
		B bobj1=(B)new A();
		System.out.println(bobj.a);
	}
}

class A{
	final int a=20;
	public static void m1(){
		System.out.println("static method from A");
	}
	public void m2(){
		System.out.println("instance method from A");
	}
}
class B extends A{
	public static void m1(){
		System.out.println("static method from B ==>> m1()");
	}
	public static void m1(int a){
		System.out.println("static method overloading from B ==>> m1(int a) : "+a);
	}
	@Override
	public void m2() {
		System.out.println("Override method from B ==>> m2()");
	}
	public void m2(int a) {
		System.out.println("instance method overloading from B ==>> m2(int a) : "+a);
	}
	public void m3() {
		System.out.println("Newly define method from B ==>> m3()");
	}
}