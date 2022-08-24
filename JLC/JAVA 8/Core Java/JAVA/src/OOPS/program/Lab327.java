package OOPS.program;

public class Lab327 {

	public static void main(String[] args) {
		Hello56 hello= new Hello56();
		hello.m1();
		hello.m2();
		
	}

}

class Hai6{
	int a=99;
	void m1(){
		System.out.println("Hai -> m1:"+a);
		}
}
class Hello56 extends Hai6{
	int b=88;
	void m2(){
		System.out.println("Hello -> m2:"+a);
		System.out.println("Hello -> m2:"+b);
		}
}