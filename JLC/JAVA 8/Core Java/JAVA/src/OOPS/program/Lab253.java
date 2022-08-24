package OOPS.program;

public class Lab253 {

	public static void main(String[] args) {
		System.out.println("Main :"+Test19.a);

	}

}
class Test19{
	
	static int a;
	
	static{
		final int b=20;
		System.out.println(a);
		System.out.println(b);
	}
}