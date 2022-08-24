package OOPS.program;

public class Lab248 {

	public static void main(String[] args) {
		
		System.out.println("Main :"+Test15.a);

	}

}
class Test15{
	
	static int a;
	int b;
	
	static{
		a=10;
		b=20;
		System.out.println("Static Block");
	}
}