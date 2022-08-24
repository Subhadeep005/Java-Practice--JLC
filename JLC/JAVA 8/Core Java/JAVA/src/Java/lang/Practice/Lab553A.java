package Java.lang.Practice;

public class Lab553A {

	public static void main(String[] args) {
		System.out.println("Main Started");
		try{
			String data=args[0];
			int x=Integer.parseInt(data);
			int res=10/x;
			System.out.println("Result :"+res);
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e){
			if(e instanceof ArrayIndexOutOfBoundsException)
				System.out.println("* Provide any value as CLA");
			else if(e instanceof NumberFormatException)
				System.out.println("* Provide int value as CLA");
			else if(e instanceof ArithmeticException)
			System.out.println("Provide non zero int value as CLA");
		}
		System.out.println("Main Completed");
	}

}
