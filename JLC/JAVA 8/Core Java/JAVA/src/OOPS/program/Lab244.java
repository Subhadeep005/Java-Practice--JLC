package OOPS.program;

public class Lab244 {

	public static void main(String[] args) {
		System.out.println(Test11.a);
		System.out.println(Test11.a);
	}

}
class Test11{
	
	static int a=10;
	
	{
		System.out.println("Instance Block");
	}
	
	static{
		System.out.println("Static Block");
	}
}