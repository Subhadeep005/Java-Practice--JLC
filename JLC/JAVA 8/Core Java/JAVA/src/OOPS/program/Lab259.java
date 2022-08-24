package OOPS.program;

public class Lab259 {

	public static void main(String[] args) {
		System.out.println("I am Main()");
		
		{
			int a=10;
			System.out.println("I am local Block 1 in main():"+a);
		}
		
		int a=90;
		System.out.println("I am Main():"+a);
	}

}
