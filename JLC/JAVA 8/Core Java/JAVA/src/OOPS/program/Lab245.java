package OOPS.program;

public class Lab245 {

	public static void main(String[] args) {
		Test12 t=null;
		System.out.println("Ref Created");

	}

}
class Test12{
	
	static int a=10;
	
	{
		System.out.println("Instance Block");
	}
	
	static{
		System.out.println("Static Block");
	}
}