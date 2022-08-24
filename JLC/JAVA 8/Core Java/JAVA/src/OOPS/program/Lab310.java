package OOPS.program;

public class Lab310 {

	public static void main(String[] args) {
		
		Hello43 h=new Hello43();
		h.sum(12,23);
	}

}

class Hello43{
	void sum(int a, int b){
		System.out.println("sum(int,int)");
		System.out.println(a+b);
	}
}