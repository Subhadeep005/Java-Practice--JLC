package OOPS.program;

interface Inter5{
	void m1();
	public abstract void m2();
	int A=10;
	public final int B=20;
}
class Hello74 implements Inter5{
	public void m1(){
		System.out.println("Hello --> m1():"+A);
	}
	public void m2(){
		System.out.println("Hello --> m2():"+B);
	}
}

public class Lab414 {

	public static void main(String[] args) {
		Inter5 ref=null;
		//ref=new Inter5(); ---->Abstract class
		ref=new Hello74();
		ref.m1(); ref.m2();
		
	}

}
