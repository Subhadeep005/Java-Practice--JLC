package Test_Program;

public class Test {
	public static void main(String[] args) {
		Check ck=new Check();
		System.out.println("ck--->"+ck);
		ck.m1();
		Check ck2=new Check();
		System.out.println("ck2--->"+ck2);
		ck2.m1();
		m2();
	}
	static void m2(){
		System.out.println("m2()");
	}
}
class Check{
	void m1(){
		System.out.println("m1()");
		System.out.println(this);
	}
	
}