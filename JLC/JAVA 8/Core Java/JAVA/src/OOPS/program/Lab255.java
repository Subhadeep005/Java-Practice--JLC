package OOPS.program;

public class Lab255 {

	public static void main(String[] args) {
		
		Test21 t=new Test21();
		}

	}

	class Test21{
		
		{
			int a=10;
			System.out.println("From Block 1 :"+a);
		}
		
		{
			System.out.println("From Block 2 :"+a);
		}
	}