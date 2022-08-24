package OOPS.program;

public class Lab242 {

	public static void main(String[] args) {
		
		System.out.println("Main :"+Test9.a);
	}

}
class Test9{
	static int a;
	
	{	
	    a=10;
		System.out.println("Initialized :"+a);
	}
}