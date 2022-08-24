package OOPS.program;

public class Lab379 {
	public static void main(String[] args) {
		Hai17 hai=new Hai17();
		hai.m1();
	}

}
class Hello67{
	A22 m1(){
		System.out.println("m1 in Hello");
		return new A22();
	}
}
class Hai17 extends Hello67{
	B20 m1(){
		System.out.println("m1 in Hai");
		return new B20();
	}
}
class A22{}
class B20 extends A22{}