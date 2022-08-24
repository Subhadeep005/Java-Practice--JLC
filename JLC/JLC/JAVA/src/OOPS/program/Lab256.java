package OOPS.program;

public class Lab256 {

	public static void main(String[] args) {
		
		Test22 t=new Test22();
		System.out.println("Main :"+t.a);
	}

}

class Test22{
	 
	{
		 int a=30;
		System.out.println("From Block 1 :"+a);
	}
	static{
		int a=20;
		System.out.println("From Block 2 :"+a);
	}
}