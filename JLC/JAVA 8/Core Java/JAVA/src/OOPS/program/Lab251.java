package OOPS.program;

public class Lab251 {

	public static void main(String[] args) {
		
		Test17 t=new Test17();
	}

}

class Test17{
	int a;
	static int b;
	
	{
		int c; // Local variable must be initialized.
		System.out.println("From A:"+a);
		System.out.println(b);
		System.out.println(c);
	}
}