package OOPS.program;

interface Inter6{
	void m1();
	public abstract void m2();
	int A=10;
	public final int B=20;
}
abstract class Hello75 implements Inter6{
	@Override
	public void m1(){
		System.out.println("Hello --> m1():"+A);
	}
}
class Hai19 extends Hello75{
	@Override
	public void m2(){
		System.out.println("Hai --> m2():"+B);
	}
	void m3(){
		System.out.println("Hai --> m3()");
	}
}

public class Lab415 {

	public static void main(String[] args) {
		Inter6 ref=new Hai19();
		ref.m1();  ref.m2();  //ref.m3();  ---> Using Dynamic dispatch ref we cannot call sub classes own implementation.
	}

}
