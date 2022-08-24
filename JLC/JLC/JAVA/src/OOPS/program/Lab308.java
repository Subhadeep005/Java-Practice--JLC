package OOPS.program;

public class Lab308 {

	public static void main(String[] args) {
		Hai hai=new Hai();
		hai.a=99;
		Hello41 hello=new Hello41();
		System.out.println("Main Begin:"+hai.a);
		hello.m1(hai);
		System.out.println("Main Ends:"+hai.a);
	}

}

class Hello41{
	void m1(Hai hai){
		System.out.println("m1 Begin:"+hai.a);	
		hai.a=hai.a+10;
		System.out.println("m1 Ends:"+hai.a);	
	}
}
class Hai{
	int a;
}
