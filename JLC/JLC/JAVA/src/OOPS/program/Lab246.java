package OOPS.program;

public class Lab246 {

	public static void main(String[] args) {
		
		Test13 t=null;
		System.out.println("Ref Created");
		t=new Test13();

	}

}
class Test13{
	
	{
		System.out.println("Instance Block");
	}
	
	static{
		System.out.println("Static Block");
	}
}