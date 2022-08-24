package OOPS.program;

public class Lab256a {

	public static void main(String[] args) {
		
		Test23 t=new Test23();
		System.out.println("From Main :"+t.a);
	}

}

class Test23{
	static int a;
	{
		 a=10;
		System.out.println("From Instance Block :"+a);
	}
	static{
		 a=20;
		System.out.println("From Static Block :"+a);
	}
}