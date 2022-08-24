package OOPS.program;

public class Lab309 {

	public static void main(String[] args) {
		Hai1 hai=new Hai1();
		hai.a=99;
		Hello42 hello=new Hello42();
		System.out.println("Main Begin:"+hai.a);
		hello.m1(hai);
		System.out.println("Main Ends:"+hai.a);
	}

}

class Hello42{
	void m1(Hai1 hai){
		System.out.println("m1 Begin:"+hai.a);
		hai=new Hai1();
		hai.a=hai.a+10;
		System.out.println("m1 Ends:"+hai.a);	
	}
}
class Hai1{
	int a;
}
