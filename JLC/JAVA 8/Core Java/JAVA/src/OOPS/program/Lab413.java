package OOPS.program;
interface Inter4{
	void m1();
	public abstract void m2();
	int A=10;
	public final int B=20;
}
class Hello73 implements Inter4{
	void m1(){  //----> public keyword
		System.out.println("Hello --> m1()");
	}
	public void m2(){
		System.out.println("Hello --> m2()");
	}
}

public class Lab413 {

	public static void main(String[] args) {
		System.out.println("Hello Guys!");
	}

}
