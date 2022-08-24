package OOPS.program;

public class Lab247 {

	public static void main(String[] args) {
		
		Test14 t=new Test14();
		new Test14();

	}

}
class Test14{
	
	{
		System.out.println("Instance Block");
	}
	
	static{
		System.out.println("Static Block");
	}
}