package OOPS.program;

public class Lab326 {

	public static void main(String[] args) {
		
		Hello55 hello= new Hello55();
		hello.m1();
		hello.m2();
		
	}

}

class Hai5{
	int a=99;
	void m1(){
		System.out.println("Hai -> m1:"+a);
		System.out.println("Hai -> m1:"+b);
		}
}
class Hello55 extends Hai5{
	int b=88;
	void m2(){
		System.out.println("Hello -> m2:"+a);
		System.out.println("Hello -> m2:"+b);
		}
}