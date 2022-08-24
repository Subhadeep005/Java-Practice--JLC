package OOPS.program;

public class Lab316 {

	public static void main(String[] args) {
		
		Hello49 h=new Hello49();
		h.m1();

	}

}

class Hello49{
	void m1(int...a){
		System.out.println("m1(int...)");
	}
	void m1(String...a){
		System.out.println("m1(String...)");
	}
}