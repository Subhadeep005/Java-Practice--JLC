package Java.lang.Practice;

public class Lab555 {

	public static void main(String[] args) {
		System.out.println("Main Started");
		try{
			int res=10/0;
			System.out.println("Result :"+res);
		}catch(NumberFormatException e){
			System.out.println("* Invalid Input");
		}finally{
			System.out.println("finnaly block");
			System.out.println("Main Completed");
		}
	}

}
