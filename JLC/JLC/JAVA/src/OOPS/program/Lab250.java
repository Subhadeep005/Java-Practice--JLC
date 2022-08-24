package OOPS.program;

public class Lab250 {

	public static void main(String[] args) {
		
		Test16 t=new Test16();
	}

}

class Test16{
	int a;
	static int b;
	
	{
		int c=30;
		System.out.println("From A:"+a);
		System.out.println(b);
		System.out.println(c);
	}
}