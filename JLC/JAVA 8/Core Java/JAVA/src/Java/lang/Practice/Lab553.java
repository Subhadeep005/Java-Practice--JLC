package Java.lang.Practice;

public class Lab553 {

	public static void main(String[] args) {
		System.out.println("Main Started");
		try{
			String data=args[0];
			int x=Integer.parseInt(data);
			int res=10/x;
			System.out.println("Result :"+res);
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e){
			System.out.println("Provide non zero int value as CLA");
		}
		System.out.println("Main Completed");
	}

}
