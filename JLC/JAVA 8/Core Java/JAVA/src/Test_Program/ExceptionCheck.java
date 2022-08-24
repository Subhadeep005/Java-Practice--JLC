package Test_Program;

public class ExceptionCheck {

	public static void main(String[] args) {
		try{
			System.out.println("A");
			System.out.println(10/0);
			System.out.println("B");
			try{
				System.out.println("C");
				System.out.println(10/0);
				System.out.println("D");
			}catch(NumberFormatException e){
				System.out.println("E");
			}finally {
				System.out.println("F");
			}
			System.out.println("G");
		}catch(Exception e){
			System.out.println("H");
		}finally {
			System.out.println("I");
		}
		System.out.println("J");
	}

}
