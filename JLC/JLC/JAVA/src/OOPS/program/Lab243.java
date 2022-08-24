package OOPS.program;

public class Lab243 {

	public static void main(String[] args) {
		System.out.println("Main :"+Test10.a);
	}

}
class Test10{
	static int a;
	
	static{	
	    a=10;
		System.out.println("Initialized :"+a);
	}
}