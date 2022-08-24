package OOPS.program;

public class Lab307 {

	public static void main(String[] args) {
		
		int a=99;
		Hello40 h=new Hello40();
		System.out.println("Main Begin:"+a);
		h.m1(a);
		System.out.println("Main Ends:"+a);
	}

}

class Hello40{
	void m1(int a){
		System.out.println("m1 Begin:"+a);	
		a=a+10;
		System.out.println("m1 Ends:"+a);	
	}
}