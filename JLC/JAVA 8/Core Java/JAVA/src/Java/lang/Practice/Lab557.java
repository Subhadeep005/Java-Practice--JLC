package Java.lang.Practice;

public class Lab557 {

	public static void main(String[] args) {
		System.out.println("Main Started");
		try{
			int res=10/3;
			System.out.println("Result :"+res);
			return;
		}catch(Exception e){
			System.out.println("* Invalid Input");
		}finally{
			System.out.println("Main Completed");
		}
	}

}
