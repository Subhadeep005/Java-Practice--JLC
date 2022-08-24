package OOPS.program;

public class Lab378 {

	public static void main(String[] args) {
		Hai16 hai=new Hai16();
		hai.m1();
	}

}
class Hello66{
	A21 m1(){
		System.out.println("m1 in Hello");
		return new A21();
	}
}
class Hai16 extends Hello66{
	A21 m1(){
		System.out.println("m1 in Hai");
		return new A21();
	}
}
class A21{}
class B19 extends A21{}