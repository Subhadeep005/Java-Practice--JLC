package Java.lang.Practice;

public class Lab551 {

	public static void main(String[] args) {
		System.out.println("Main Started");
		try{
			int res=10/0;
			System.out.println("Result :"+res);
		}catch(NumberFormatException e){
			System.out.println("* Invalid Input");
		}
		System.out.println("JLC");
		catch(Exception e){
			System.out.println("*Invalid Input");
		}
		System.out.println("Main Completed");
	}

}
