package OOPS.program;

public class Lab373 {
	public static void main(String[] args) {
		Hai14 hai=new Hai14();
		hai.m1();
		hai.m2();
		hai.m3();
	}

}
class Hello64{
	void m1(){
		System.out.println("Hello --> m1()");
	}
	void m2(){
		System.out.println("Hello --> m2()");
	}
}
class Hai14 extends Hello64{
	void m2(){
		System.out.println("Hai --> m2()");
	}
	void m3(){
		System.out.println("Hai --> m3()");
	}
}