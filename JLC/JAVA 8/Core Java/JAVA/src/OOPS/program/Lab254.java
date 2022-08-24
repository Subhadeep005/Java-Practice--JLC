package OOPS.program;

public class Lab254 {

	public static void main(String[] args) {
		
		Test20 t=new Test20();
	}

}

class Test20{
	
	{
		int a=10;
		System.out.println("From Block 1 :"+a);
	}
	{
		String a="JLC";
		System.out.println("From Block 2 :"+a);
	}
}