package Test_Program;

class  A2{
	int a=99;
	void m1(){
		System.out.println("A -- m1()");
	}
}
class B2 extends A2{
	int a=88;
	void m2(){
		System.out.println("B -- m2()");
	}
	@Override
	public void m1() {
		System.out.println("B -- m1()");
	}
}

public class Test2 {

	public static void main(String[] args) {
		A2 aob=new B2();
		aob.m1();
		System.out.println(aob.a);
		//aob.m2();
	}

}
