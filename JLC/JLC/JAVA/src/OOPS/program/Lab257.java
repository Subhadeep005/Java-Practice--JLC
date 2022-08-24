package OOPS.program;

public class Lab257 {

	public static void main(String[] args) {
		
		System.out.println("I am Main()");
		{
			int a=10;
			System.out.println("I am local Block 1 in main():"+a);
		}
		{
			int a=20;
			System.out.println("I am local Block 2 in main():"+a);
		}
		{
			String a="JLC";
			System.out.println("I am local Block 2 in main():"+a);
		}
	}

}
